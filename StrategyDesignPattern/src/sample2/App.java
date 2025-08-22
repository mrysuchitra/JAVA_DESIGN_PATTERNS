package sample2;

public class App {

    public static void main(String args[]){
        var checkout = new Checkout();
        checkout.payForItems(PaymentMethod.payByCard);
        checkout.payForItems(PaymentMethod.payByBankTransfer);
    }
}
