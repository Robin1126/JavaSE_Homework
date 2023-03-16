/**
 * Author : Binbin Luo
 * Date : 16.03.2023
 */
// 用来初始化票的线程
public class InitializeThread implements Runnable{
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }


    public InitializeThread(Ticket ticket) {
        this.ticket = ticket;
    }

    public InitializeThread() {
    }

    public void initialize() {
        ticket.setTickets(new Ticket[200]);
        for (int i = 0; i < ticket.getTickets().length; i++) {
            ticket.getTickets()[i] = new Ticket();
            ticket.getTickets()[i].setNo(i);
            ticket.getTickets()[i].setState(true);
        }
    }
    @Override
    public void run() {
        initialize();
    }
}
