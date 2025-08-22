package sample2;

public class App {

    public static void main(String args[]){
          var location = new Location();
          var location1 = new Location();
          var weatherUpdates = new WeatherUpdates();

          location.addPropertyChangeListener(weatherUpdates);
          location1.addPropertyChangeListener(weatherUpdates);

          location.setWeatherEvent("Sunny");
          location1.setWeatherEvent("Rainy");

          weatherUpdates.printUpdates();

    }
}
