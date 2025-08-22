package sample1;

public class UnsubscribeEmail extends Email{
    @Override
    public void sendMessage() {
        System.out.println("We are sorry to see you go.");
    }
}
