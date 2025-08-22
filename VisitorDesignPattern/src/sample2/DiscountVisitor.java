package sample2;

public class DiscountVisitor implements Visitor{
    @Override
    public void visit(AdultTicket adultTicket) {
        adultTicket.setPrice(5);
    }

    @Override
    public void visit(GroupTicket groupTicket) {
        groupTicket.getTickets().forEach(ticket -> ticket.accept(this));
    }
}
