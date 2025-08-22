package sample1;

public abstract class Meal {

    private int price;

    public Meal(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
       this.price = price;
    }

    public String toString(){
        return "Meal{" +
                "price=" + price +
                '}';
    }

    public abstract Meal clone();

}
