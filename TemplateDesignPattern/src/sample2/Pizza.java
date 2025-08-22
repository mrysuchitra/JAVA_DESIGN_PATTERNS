package sample2;

public abstract class Pizza {

    public void makeBase() {
        System.out.println("Making pizza base");
    }

    public abstract void addToppings();

    public void cook() {
        System.out.println("Baking pizza");
    }
}
