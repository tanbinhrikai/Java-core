package bai6;

public interface Logger {
    public void log(String message);
    default void  logInfo(String message) {
        log("[INFO]".concat(message));
    }
    default void logError(String message) {
        log("[ERROR]".concat(message));
    }
    default  void logWarn(String message) {
        log("[WARN]".concat(message));
    }
}
