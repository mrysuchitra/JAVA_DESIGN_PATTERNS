package sample1;

public class File implements FileSystemElement{

    private String name;
    private int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    public String getName(){
        return name;
    }

    public int getSize(){
        return size;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
