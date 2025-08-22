package sample1;

public class App {

    public static void main(String args[]){
        var pen = new Item("Pen", 20);
        var pencil = new Item("Pencil", 0);
        var eraser = new Item("Eraser", 15);

        var inventory = new Inventory(pen, pencil, eraser);
        var stockInventory = new StockInventory(inventory);

        while(stockInventory.hasNext()){
            var item = stockInventory.next();
            if(item != null) {
                System.out.println("Item: " + item.getName() + ", Quantity: " + item.getQuantity());
            }
        }

    }

}
