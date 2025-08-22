package sample2;

public class App {

    public static void main(String args[]){

        var adultTicket1 = new AdultTicket(10);
        var adultTicket2 = new AdultTicket(15);
        var groupTicket = new GroupTicket();
        groupTicket.addTicket(adultTicket1);
        groupTicket.addTicket(adultTicket2);

        System.out.println("Before discount:");
        System.out.println("Adult Ticket 1 Price: " + adultTicket1.getPrice());

        System.out.println("Adult Ticket 2 Price: " + adultTicket2.getPrice());
        System.out.println("Group Ticket Price: " + groupTicket.getPrice());

        var discountVisitor = new DiscountVisitor();
        groupTicket.accept(discountVisitor);
        System.out.println("After discount:");
        System.out.println("Adult Ticket 1 Price: " + adultTicket1.getPrice());
        System.out.println("Adult Ticket 2 Price: " + adultTicket2.getPrice());

        System.out.println("Group Ticket Price: " + groupTicket.getPrice());
    }

}
