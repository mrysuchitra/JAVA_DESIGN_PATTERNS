package sample1;

public class OrderTracker {

    public static void main(String[] args){

        PizzaFlavour flavour = new PizzaFlavour("Margherita");
        Pizza pizza1 = new Pizza(10, flavour);
        Pizza pizza2 = pizza1.clone();
        Pizza pizza3 = pizza1.clone();
        Pizza pizza4 = pizza1.clone();
        Pizza pizza5 = pizza1.clone();
        flavour.setName("Hawaiian");


        PizzaFlavour flavour2 = new PizzaFlavour("Pepperoni");
        Pizza pizza6 = new Pizza(12, flavour2);
        Pizza pizza7 = pizza6.clone();
        Pizza pizza8 = pizza6.clone();
        Pizza pizza9 = pizza6.clone();
        Pizza pizza10 = pizza6.clone();

        System.out.println("Order Summary:");
        printOrder(pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, pizza7, pizza8, pizza9, pizza10);
    }

    public static void printOrder(Pizza... pizzas) {
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
    }
}
