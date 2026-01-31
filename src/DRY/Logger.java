package DRY;

public class Logger {

    public enum LogLevel {
        INFO, WARNING, ERROR
    }


    private void log(LogLevel level, String message) {
        System.out.println(String.format("%s: %s", level, message));
    }

    public void logInfo(String message) {
        log(LogLevel.INFO, message);
    }

    public void logWarning(String message) {
        log(LogLevel.WARNING, message);
    }

    public void logError(String message) {
        log(LogLevel.ERROR, message);
    }
}
