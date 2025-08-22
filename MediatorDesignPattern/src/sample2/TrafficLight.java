package sample2;

public class TrafficLight {

    public enum Color {
        RED, GREEN, YELLOW
    }

    private Color color = Color.RED;

    public void changeToRed() {
        color = Color.RED;
        System.out.println("Traffic light changed to RED");
    }

    public void changeToGreen() {
        color = Color.GREEN;
        System.out.println("Traffic light changed to GREEN");
    }

    public void changeToYellow() {
        color = Color.YELLOW;
        System.out.println("Traffic light changed to YELLOW");
    }
}
