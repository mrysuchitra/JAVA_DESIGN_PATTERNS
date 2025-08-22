package sample2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class WeatherUpdates implements PropertyChangeListener {

    private List<String> updates = new ArrayList<>();

    public void printUpdates() {
        updates.forEach(System.out::println);
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
       updates.add((String) event.getNewValue());
    }
}
