package sample2;

public class EuroATM extends ATM{

    public EuroATM(ATM nextATM) {
        super(nextATM);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if(request.getCurrency() == WithdrawalRequest.Currency.EUR) {
            System.out.println("Dispensing " + request.getAmount() + " EUR");
        } else if (nextATM != null) {
            nextATM.dispense(request);
        }
    }
}
