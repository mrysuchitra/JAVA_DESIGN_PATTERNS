package sample2;

public class Checkout {

    public void payForItems(PaymentMethod paymentMethod) {
        paymentMethod.pay();
    }
}
