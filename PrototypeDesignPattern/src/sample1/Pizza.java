package sample1;

public class Pizza extends Meal{

    private PizzaFlavour flavour;

    public Pizza(int price, PizzaFlavour flavour) {
        super(price);
        this.flavour = flavour;
    }

    public PizzaFlavour getFlavour() {
        return flavour;
    }

    public void setFlavour(PizzaFlavour flavour) {
        this.flavour = flavour;
    }

    public String toString() {
        return "Pizza{" +
                "flavour=" + flavour +
                ", price=" + getPrice() +
                '}';
    }


    @Override
    public Pizza clone() {
        return new Pizza(this.getPrice(), new PizzaFlavour(this.flavour.getName()));
    }
}
