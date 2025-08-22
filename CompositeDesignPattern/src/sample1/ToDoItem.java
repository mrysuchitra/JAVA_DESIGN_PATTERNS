package sample1;

public class ToDoItem implements Completable {

    private final String description;
    private boolean completed = false;

    public ToDoItem(String description){
        this.description = description;
    }

    public void complete(){
        completed = true;
    }

    @Override
    public void isCompleted() {
        System.out.println("Description: " + description + "\n" + "Completed: " + completed);
    }
}
