package sample1;

public class App {

    public static void main(String args[]){

        var ticket = new Ticket();
        var assignee = new Assignee();
        var board = new Board();

        var mediator = new Mediator(ticket, assignee, board);
        mediator.pickUpTicket();
        System.out.println();
        mediator.resolveTicket();

    }
}
