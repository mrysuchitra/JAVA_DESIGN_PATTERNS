package sample2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VendingMachine {

    private static final Map<String, Supplier<Snack>> snackSuppliers = new HashMap<>();

    static {
        snackSuppliers.put("chocolate", ChocolateBar::new);
        snackSuppliers.put("drink", Drink::new);
        snackSuppliers.put("chips", Chips::new);
    }

    public static Snack getSnack(String type) {
        Supplier<Snack> supplier = snackSuppliers.get(type.toLowerCase());
        if (supplier != null) {
            return supplier.get();
        } else {
            throw new IllegalArgumentException("Unknown snack type: " + type);
        }
    }

}
