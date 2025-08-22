package sample2;

public class PausedState implements PlayerState{
    @Override
    public void pressButton(MediaPlayer player) {
        player.play();
        player.setState(new PlayingState());
    }
}
