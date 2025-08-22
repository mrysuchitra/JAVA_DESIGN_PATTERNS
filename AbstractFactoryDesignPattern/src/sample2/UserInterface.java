package sample2;

public class UserInterface {

    private Button button;
    private ScrollBar scrollBar;

    public UserInterface(Button button, ScrollBar scrollBar) {
        this.button = button;
        this.scrollBar = scrollBar;
    }

    private Button getButton(){
        return button;
    }

    private ScrollBar getScrollBar(){
        return scrollBar;
    }

    public String toString() {
        return "UserInterface{" +
                "button=" + button.getColor() +
                ", scrollBar=" + scrollBar.getColor() +
                '}';
    }
}
