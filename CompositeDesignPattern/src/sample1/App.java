package sample1;

public class App {

    public static void main(String args[]){

        CheckList checkList = new CheckList();

        ToDoItem item1 = new ToDoItem("Buy groceries");
        ToDoItem item2 = new ToDoItem("Walk the dog");
        ToDoItem item3 = new ToDoItem("Read a book");

        checkList.addItem(item1);
        checkList.addItem(item2);
        checkList.addItem(item3);

        item1.complete();
        item2.complete();

        checkList.isCompleted();


    }

}
