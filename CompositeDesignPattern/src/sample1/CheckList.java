package sample1;

import java.util.ArrayList;
import java.util.List;

public class CheckList implements Completable {

    List<ToDoItem> toDoItemList = new ArrayList<>();

    public void addItem(ToDoItem item) {
        toDoItemList.add(item);
    }


    @Override
    public void isCompleted() {
        toDoItemList.forEach(ToDoItem :: isCompleted);
    }
}
