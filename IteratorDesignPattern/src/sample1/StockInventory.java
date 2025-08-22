package sample1;

import java.util.Iterator;

public class StockInventory implements Iterator<Item> {

    private Inventory inventory;
    private int index;

    public StockInventory(Inventory inventory) {
        this.inventory = inventory;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < inventory.getItems().length;
    }

    @Override
    public Item next() {
        var items = inventory.getItems();
        if(hasNext()) {
            Item item = items[index++];
            if(item.getQuantity() <= 0) {
                return next();
            }else {
                return item;
            }
        }else {
            return null;
        }
    }
}
