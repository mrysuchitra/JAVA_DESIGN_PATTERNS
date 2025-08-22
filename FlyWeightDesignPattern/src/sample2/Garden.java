package sample2;

public class Garden {

    public static void main(String[] args) {

        var rose1 = FlowerFactory.createFlower("Rose");
        var rose2 = FlowerFactory.createFlower("Rose");
        var rose3 = FlowerFactory.createFlower("Rose");

        System.out.println("Rose 1: " + rose1);
        System.out.println("Rose 2: " + rose2);
        System.out.println("Rose 3: " + rose3);

        System.out.println();

        var tulip1 = FlowerFactory.createFlower("Tulip");
        var tulip2 = FlowerFactory.createFlower("Tulip");
        var tulip3 = FlowerFactory.createFlower("Tulip");

        System.out.println("Tulip 1: " + tulip1);
        System.out.println("Tulip 2: " + tulip2);
        System.out.println("Tulip 3: " + tulip3);

        System.out.println();
    }
}
