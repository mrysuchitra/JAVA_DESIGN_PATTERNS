package sample1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class TicketMachine {

    private final static Map<String, Supplier<Ticket>> ticketSuppliers = new HashMap<>();

    static {
        ticketSuppliers.put("train", TrainTicket::new);
        ticketSuppliers.put("bus", BusTicket::new);
    }

    public static Ticket createTicket(String type) {
        Supplier<Ticket> supplier = ticketSuppliers.get(type.toLowerCase());
        if (supplier != null) {
            return supplier.get();
        } else {
            throw new IllegalArgumentException("Unknown ticket type: " + type);
        }
    }


}
