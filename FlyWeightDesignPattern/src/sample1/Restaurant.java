package sample1;

public class Restaurant {

    public static void main(String[] args) {

        var pizza1 = OrderFactory.createOrder("Pizza");
        var pizza2 = OrderFactory.createOrder("Pizza");
        var pizza3 = OrderFactory.createOrder("Pizza");

        System.out.println("Pizza 1: " + pizza1);
        System.out.println("Pizza 2: " + pizza2);
        System.out.println("Pizza 3: " + pizza3);

        System.out.println();

        var burger1 = OrderFactory.createOrder("Burger");
        var burger2 = OrderFactory.createOrder("Burger");
        var burger3 = OrderFactory.createOrder("Burger");

        System.out.println("Burger 1: " + burger1);
        System.out.println("Burger 2: " + burger2);
        System.out.println("Burger 3: " + burger3);

        System.out.println();

    }
}
