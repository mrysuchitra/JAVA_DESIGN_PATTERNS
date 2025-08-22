package sample1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement{

    private String name;
    private List<FileSystemElement> elements = new ArrayList<>();

    public Directory(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void addElement(FileSystemElement element){
        elements.add(element);
    }

    public List<FileSystemElement> getElements(){
        return elements;
    }


    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
