package sample1;

public class App {

    public static void main(String args[]){

          var context = "_My Variable";
          Expression expression = new FirstLetterShouldNotBeUnderscore();
          String result = expression.interpret(context);
          System.out.println(result); // Output: myVariable

    }

}
