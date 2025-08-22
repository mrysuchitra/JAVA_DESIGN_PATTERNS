package sample2;

public class FrenchMessageAdapter extends FrenchLocalizedMessage implements LocalizedMessage {

    @Override
    public void sayHello() {
        sayBonjour();
    }

    public void sayBonjour() {
        System.out.println("Bonjour !!");
    }
}
