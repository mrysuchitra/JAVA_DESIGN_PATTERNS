package sample1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {

    private static Map<String, Supplier<BikeFactory>> bikeTypes = new HashMap<>();

    static {
        bikeTypes.put("Mountain", MountainBikeFactory::new);
        bikeTypes.put("Road", RoadBikeFactory::new);
    }

    public static BikeFactory getBikeFactory(String type) {
        if (bikeTypes.get(type) != null) {
            return bikeTypes.get(type).get();
        } else {
            throw new IllegalArgumentException("Unknown bike type: " + type);
        }
    }
}
