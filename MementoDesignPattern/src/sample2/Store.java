package sample2;

public class Store {

    public static void main(String args[]){

        var item = new Item(100);
        item.save();
        System.out.println("Current price: " + item.getPrice());

        item.setPrice(200);
        System.out.println("Modified price: " + item.getPrice());

        item.undo();
        System.out.println("After undo, price: " + item.getPrice());

    }
}
