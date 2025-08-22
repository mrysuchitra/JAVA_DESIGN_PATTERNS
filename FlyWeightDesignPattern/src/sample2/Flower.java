package sample2;

public class Flower {

    private String name;

    public Flower(String name) {
        this.name = name;
        System.out.println("Creating " + name + " Object");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Done Creating " + name + " Object");
    }

}
