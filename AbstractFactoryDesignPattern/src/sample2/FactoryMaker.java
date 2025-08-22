package sample2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {

    private static Map<String, Supplier<UserInterfaceFactory>> uiFactories = new HashMap<>();

    static {
        uiFactories.put("BLUE", BlueUserInterfaceFactory::new);
        uiFactories.put("RED", RedUserInterfaceFactory::new);
    }

    public static UserInterfaceFactory getUserInterfaceFactory(String color) {
        if (uiFactories.get(color.toUpperCase()) != null) {
            return uiFactories.get(color.toUpperCase()).get();
        } else {
            throw new IllegalArgumentException("No factory found for color: " + color);
        }
    }



}
