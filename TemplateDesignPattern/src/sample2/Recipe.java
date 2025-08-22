package sample2;

public class Recipe {

    public static void main(String args[]) {
          var meatFeastPizza = new MeatFeastPizza();
          meatFeastPizza.makeBase();
          meatFeastPizza.addToppings();
          meatFeastPizza.cook();

          System.out.println("-------------------------------------------------");

          var vegetarianPizza = new VegetarianPizza();
          vegetarianPizza.makeBase();
          vegetarianPizza.addToppings();
          vegetarianPizza.cook();
    }
}
