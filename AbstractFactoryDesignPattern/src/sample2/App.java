package sample2;

public class App {

    public static void main(String[] args) {

        var blueUI = buildUserInterface("BLUE");
        var redUI = buildUserInterface("RED");

        System.out.println("Blue User Interface: " + blueUI);
        System.out.println("Red User Interface: " + redUI);
    }

    private static UserInterface buildUserInterface(String color) {
        var uiFactory = FactoryMaker.getUserInterfaceFactory(color);
        var button = uiFactory.createButton();
        var scrollBar = uiFactory.createScrollBar();
        return new UserInterface(button, scrollBar);
    }
}
