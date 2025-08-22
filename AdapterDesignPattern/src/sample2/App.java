package sample2;

public class App {

    public static void main(String args[]){
        var localizedMessage = new EnglishLocalizedMessage();
        var greeting = new Greeting(localizedMessage);
        greeting.print();

        var localizedMessage2 = new FrenchMessageAdapter();
        var greeting2 = new Greeting(localizedMessage2);
        greeting2.print();
    }
}
