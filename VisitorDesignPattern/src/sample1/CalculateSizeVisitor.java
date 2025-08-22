package sample1;

public class CalculateSizeVisitor implements Visitor{

    private int totalSize;

    public int getTotalSize(){
        return totalSize;
    }

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        directory.getElements().forEach(e -> e.accept(this));
    }
}
