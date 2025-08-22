package sample2;

public interface PaymentMethod {

    void pay();

    PaymentMethod payByCard = () -> System.out.println("Paying by card");
    PaymentMethod payByBankTransfer = () -> System.out.println("Paying by bank transfer");
}
