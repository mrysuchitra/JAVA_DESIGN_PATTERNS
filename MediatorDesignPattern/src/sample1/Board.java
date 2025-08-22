package sample1;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Ticket> inProgressTickets = new ArrayList<>();
    private List<Ticket> doneTickets = new ArrayList<>();

    public List<Ticket> getDoneTickets() {
        return doneTickets;
    }

    public void addTicketToInProgress(Ticket ticket) {
        inProgressTickets.add(ticket);
        System.out.println("Ticket added to in-progress list.");
    }

    public void addTicketToDone(Ticket ticket) {
        doneTickets.add(ticket);
        System.out.println("Ticket added to done list.");
        inProgressTickets.remove(ticket);
        System.out.println("Ticket removed from in-progress list.");
    }
}
