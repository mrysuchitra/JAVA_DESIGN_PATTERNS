package sample1;

public class Bike {

    private HandleBars handleBars;
    private Pedals pedals;
    private Tire frontTire;
    private Tire backTire;

    public Bike(HandleBars handleBars, Pedals pedals, Tire frontTire, Tire backTire) {
        this.handleBars = handleBars;
        this.pedals = pedals;
        this.frontTire = frontTire;
        this.backTire = backTire;
    }

    public HandleBars getHandleBars() {
        return handleBars;
    }

    public Pedals getPedals() {
        return pedals;
    }

    public Tire getFrontTire() {
        return frontTire;
    }

    public Tire getBackTire() {
        return backTire;
    }

    public String toString() {
        return "Bike{" +
                "handleBars=" + handleBars.getType() +
                ", pedals=" + pedals.getType() +
                ", frontTire=" + frontTire.getWidth() +
                ", backTire=" + backTire.getWidth() +
                '}';
    }


}
