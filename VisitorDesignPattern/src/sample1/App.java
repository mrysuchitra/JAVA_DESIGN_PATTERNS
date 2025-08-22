package sample1;

public class App {

    public static void main(String args[]){

        var directory1 = new Directory("dir1");
        var file1 = new File("file1", 100);

        directory1.addElement(file1);

        var directory2 = new Directory("dir2");
        var file2 = new File("file2", 200);
        directory2.addElement(file2);

        directory1.addElement(directory2);

        var calculateSizeVisitor = new CalculateSizeVisitor();
        directory1.accept(calculateSizeVisitor);

        System.out.println("Total size: " + calculateSizeVisitor.getTotalSize());

    }
}
