package sample1;

import java.util.Iterator;

public class Inventory implements Iterable<Item>{

    private final Item[] items;

    public Inventory(Item... items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    @Override
    public Iterator<Item> iterator(){
        return new StockInventory(this);
    }


}
