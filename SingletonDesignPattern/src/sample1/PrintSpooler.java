package sample1;

public final class PrintSpooler {

    private static PrintSpooler instance;

    private PrintSpooler(){

    }

    public static PrintSpooler getInstance(){
        if(instance == null){
            instance = new PrintSpooler();
        }
        return instance;
    }

    public void print() {
        System.out.println("Printing document......");
    }

}
