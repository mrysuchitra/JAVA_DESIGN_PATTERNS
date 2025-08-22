package sample2;

public class App {

    public static void main(String[] args){

        var trafficLight = new TrafficLight();
        var pedestrianCrossingLight = new PedestrianCrossingLight();

        var mediator = new Mediator(trafficLight, pedestrianCrossingLight);


        mediator.changeTrafficLightToYellow();
        mediator.changeTrafficLightToRed();
        mediator.changeTrafficLightToYellow();
        mediator.changeTrafficLightToGreen();
    }
}
