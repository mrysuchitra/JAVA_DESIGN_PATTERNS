package sample1;

public class WelcomeEmail extends Email{
    @Override
    public void sendMessage() {
        System.out.println("Thank you for signing up for our service.");
    }
}
