package sample2;

public class App {

    public static void main(String args[]){

        var withdrawalRequest1 = new WithdrawalRequest(100.00,
                WithdrawalRequest.Currency.USD);
        var atmChain = buildATMChain();
        atmChain.dispense(withdrawalRequest1);

    }

    private static ATM buildATMChain() {
        ATM euroATM = new EuroATM(null);
        ATM usDollarATM = new UsDollarATM(euroATM);
        return usDollarATM;
    }
}
