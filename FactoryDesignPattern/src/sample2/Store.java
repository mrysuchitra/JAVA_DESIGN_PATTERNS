package sample2;

public class Store {

    private static final VendingMachine vendingMachine = new VendingMachine();

    public static void main(String[] args) {
        buySnack("Chocolate");
        buySnack("Drink");
        buySnack("Chips");
    }

    private static void buySnack(String snackType) {
        Snack snack = vendingMachine.getSnack(snackType);
        System.out.println("One " + snackType + " purchased. The price is $" + snack.getPrice() + ".");
    }
}
