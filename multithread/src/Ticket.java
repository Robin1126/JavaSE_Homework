/**
 * Author : Binbin Luo
 * Date : 16.03.2023
 */
public class Ticket {

    private boolean state;

    public Ticket() {
    }

    public Ticket(boolean state) {
        this.state = state;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
