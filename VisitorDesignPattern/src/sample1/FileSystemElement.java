package sample1;

public interface FileSystemElement {

    String getName();

    void accept(Visitor v);

}
