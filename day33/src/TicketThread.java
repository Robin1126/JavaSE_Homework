/**
 * Author : Binbin Luo
 * Date : 16.03.2023
 */
public class TicketThread implements Runnable {
    private Ticket ticket;

    public TicketThread(Ticket ticket) {
        this.ticket = ticket;
    }

    public TicketThread() {
    }

    @Override
    public void run() {
        try {
            while(ticket.getNo() < ticket.getTickets().length) {
                ticket.sale(ticket.getTickets());
            }
        } catch (SoldoutError e) {
            System.out.println(e.getMessage());
        }
    }
}
