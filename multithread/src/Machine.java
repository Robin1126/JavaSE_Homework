/**
 * Author : Binbin Luo
 * Date : 16.03.2023
 */
// 模拟售票机
public class Machine implements Runnable {
    private TicketBox tb;

    public Machine(TicketBox tb) {
        this.tb = tb;
    }

    @Override
    public void run() {
        try {
            while (tb.getSold() < tb.getTickets().length) {
                synchronized (tb) { // 给要访问的票仓上锁，直到售出一张票位置才解锁
                tb.sale();}
            }
        } catch (SoldoutException e) {
            System.out.println(e.getMessage());
        }
    }
}

