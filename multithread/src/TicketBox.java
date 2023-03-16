/**
 * Author : Binbin Luo
 * Date : 16.03.2023
 */
// 票仓类
public class TicketBox implements Sale{
    private Ticket[] tickets;
    private int sold = 0; //售出的票数量，为票的序列号-1

    public TicketBox() {
    }

    public TicketBox(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    @Override
    public void sale() throws SoldoutException {
        if (tickets[sold].isState()) {
            System.out.println(Thread.currentThread().getName() + "预订了第" + (sold + 1) + "号票");
            tickets[sold].setState(false);
            if (sold < tickets.length - 1) {
                sold++;
            }
        }else {
            throw new SoldoutException("票已经全部售出"); // 抛出异常
        }

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
