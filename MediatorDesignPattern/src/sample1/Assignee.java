package sample1;

import java.util.ArrayList;
import java.util.List;

public class Assignee {

    private List<Ticket> tickets = new ArrayList<>();

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void pickUpTicket(Ticket ticket) {
        tickets.add(ticket);
        System.out.println("Ticket picked up by assignee.");
    }

    public void resolveTicket(Ticket ticket){
        tickets.remove(ticket);
        System.out.println("Ticket resolved");
    }

}
