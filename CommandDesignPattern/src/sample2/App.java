package sample2;

public class App {

    public static void main(String[] args) {

        var light = new Light();
        light.isOn();

        var executor = new LightCommandExecutor();
        executor.execute(new TurnOnLightCommand(light));
        light.isOn();
        executor.execute(new TurnOffLightCommand(light));
        light.isOn();

    }
}
