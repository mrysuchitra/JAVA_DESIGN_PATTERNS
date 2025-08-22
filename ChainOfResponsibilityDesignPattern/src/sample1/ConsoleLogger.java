package sample1;

public class ConsoleLogger extends Logger {

    public ConsoleLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(LoggerRequest request) {
        if (request.getType() == LoggerRequest.LoggerType.CONSOLE) {
            System.out.println(request.getMessage());
        } else if (nextLogger != null) {
            nextLogger.log(request);
        }
    }
}
