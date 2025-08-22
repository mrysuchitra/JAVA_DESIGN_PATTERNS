package sample1;

public class LoggerRequest {

    private final String message;
    private final LoggerType type;

    public LoggerRequest(String message, LoggerType type) {
        this.message = message;
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public LoggerType getType() {
        return type;
    }

    public enum LoggerType{
        CONSOLE,
        FILE,
    }
}
