package sample2;

public class PlayingState implements PlayerState{
    @Override
    public void pressButton(MediaPlayer player) {
        player.pause();
        player.setState(new PausedState());
    }
}
