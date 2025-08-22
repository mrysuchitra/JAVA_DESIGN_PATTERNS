package sample1;

public class App {

    public static void main(String args[]){

        var message = "Hello, World!";
        var request = new LoggerRequest(message, LoggerRequest.LoggerType.FILE);
        var logger = buildLoggerChain();
        logger.log(request);
    }

    private static Logger buildLoggerChain() {
        var fileLogger = new FileLogger(null);
        return new ConsoleLogger(fileLogger);
    }

}
