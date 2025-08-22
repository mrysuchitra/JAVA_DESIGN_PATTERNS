package sample2;

public interface TicketElement {

    int getPrice();

    void accept(Visitor visitor);
}
