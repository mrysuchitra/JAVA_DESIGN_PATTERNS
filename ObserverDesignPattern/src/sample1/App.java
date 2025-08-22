package sample1;

public class App {

    public static void main(String args[]){

        User user1 = new User();
        User user2 = new User();
        NewsFeed newsFeed = new NewsFeed();

        user1.addPropertyChangeListener(newsFeed);
        user2.addPropertyChangeListener(newsFeed);

        user1.setStatus("Going for a walk");
        user2.setStatus("Having lunch");

        newsFeed.printStatuses();
    }
}
