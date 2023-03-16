/**
 * Author : Binbin Luo
 * Date : 16.03.2023
 */
public class Initialize implements Runnable{
    private TicketBox tb;

    public Initialize(TicketBox tb) {
        this.tb = tb;
    }

    @Override
    public void run() {
        initilize();
    }

    public void initilize() {
        for (int i = 0; i < tb.getTickets().length; i++) {
            tb.getTickets()[i] = new Ticket();
            tb.getTickets()[i].setState(true);
        }
    }
}
