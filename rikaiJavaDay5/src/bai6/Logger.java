package bai6;

public interface Logger {

    void log(String message);

    default void logInfo(String message) {
        log("[INFO] " + message);
    }

    default void logError(String message) {
        log("[ERROR] " + message);
    }

    default void logWarning(String message) {
        log("[WARN] " + message);
    }
}