package sample1;

public abstract class Email {

    public void sendGreeting() {
        System.out.println("Hello, ");
    }

    public abstract void sendMessage();

    public void sendClosing() {
        System.out.println("Best regards, Sam");
    }
}
