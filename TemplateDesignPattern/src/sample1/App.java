package sample1;

public class App {

    public static void main(String args[]){
          var welcomeEmail = new WelcomeEmail();
          welcomeEmail.sendGreeting();
          welcomeEmail.sendMessage();
          welcomeEmail.sendClosing();

          System.out.println();

          var unsubscribeEmail = new UnsubscribeEmail();
          unsubscribeEmail.sendGreeting();
          unsubscribeEmail.sendMessage();
          unsubscribeEmail.sendClosing();
    }
}
