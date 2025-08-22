package sample1;

public class MusicPlayer {

    private static final RecommendationsProxy recommendationsProxy =
            new RecommendationsProxy();

    public static void main(String args[]){

        var user = new User("Alice", true);
        loadHomePage(user);
        loadDiscoverPage(user);

        System.out.println();

        var user1 = new User("Bob", false);
        loadHomePage(user1);
        loadDiscoverPage(user1);

    }

    private static void loadHomePage(User user) {
        System.out.println("Loading home page...");
        recommendationsProxy.showRecommendations(user);
    }

    private static void loadDiscoverPage(User user) {
        System.out.println("Loading discover page...");
        recommendationsProxy.showRecommendations(user);
    }

}
