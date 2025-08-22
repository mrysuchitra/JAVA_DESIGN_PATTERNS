package sample1;

public class PizzaFlavour {

    private String name;

    public PizzaFlavour(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "PizzaFlavour{" +
                "name='" + name + '\'' +
                '}';
    }

}
