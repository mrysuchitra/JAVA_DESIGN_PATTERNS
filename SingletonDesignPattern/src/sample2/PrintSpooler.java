package sample2;

public enum PrintSpooler {

    INSTANCE;

    private PrintSpooler() {
    }

    public static PrintSpooler getInstance() {
        return INSTANCE;
    }

    public void print() {
        System.out.println("Printing) document......");
    }
}
