package sample2;

import java.util.ArrayList;
import java.util.List;

public class GroupTicket implements TicketElement{

    private List<TicketElement> tickets = new ArrayList<>();

    @Override
    public int getPrice() {
        return tickets.stream().mapToInt(TicketElement::getPrice).sum();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void addTicket(TicketElement ticket){
        tickets.add(ticket);
    }

    public List<TicketElement> getTickets(){
        return tickets;
    }


}
