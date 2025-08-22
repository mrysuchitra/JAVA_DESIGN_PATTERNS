package sample2;

public class App {

    private static final MediaPlayerProxy mediaPlayerProxy = new MediaPlayerProxy();

    public static void main(String args[]){
        goToMovieLibrary();
        goToFavouriteMovie();

        System.out.println();

        goToMovieLibrary();
        goToFavouriteMovie();
    }

    private static void goToMovieLibrary(){
        System.out.println("Loading movie library...");
        mediaPlayerProxy.playMedia();
    }

    private static void goToFavouriteMovie(){
        System.out.println("Loading Favourite movies...");
        mediaPlayerProxy.playMedia();
    }
}
