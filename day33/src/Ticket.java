/**
 * Author : Binbin Luo
 * Date : 16.03.2023
 */
// 票类，票有三个属性： 1.号码 2.票是否被预购 3.票组
public class Ticket implements saleTickets {
    private Ticket[] tickets;
    private int no; // 车票号码
    private boolean state; // 车票是否已经被预定

    public Ticket() {
    }

    public Ticket(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public void sale(Ticket[] tickets) throws SoldoutError {
        if (tickets[getNo()].isState()) {
            System.out.println(Thread.currentThread().getName() + "预定了" + tickets[getNo()].getNo() + "号车票成功");
            tickets[getNo()].setState(false);
            if (no < 199) {
                no++;
            }
        }else {
            throw new SoldoutError("车票已售出！");
        }
    }
}
