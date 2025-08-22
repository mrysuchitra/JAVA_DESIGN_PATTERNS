package sample1;

public class Order {

    private String name;

    public Order(String name) {
        this.name = name;
        System.out.println("Creating " + name + " Object");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Done Creating " + name + " Object");
    }

}
