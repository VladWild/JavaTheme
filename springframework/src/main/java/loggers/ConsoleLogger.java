package loggers;

public class ConsoleLogger implements Logger {
    public void logEvent(String msg) {
        System.out.println(msg);
    }
}
