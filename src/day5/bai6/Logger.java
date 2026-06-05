package day5.bai6;

public interface Logger {
    void log(String message);

    default void logInfo(String msg) {
        log("[INFO] " + msg);
    }

    default void logError(String msg) {
        log("[ERROR] " + msg);
    }

    default void logWarning(String msg) {
        log("[WARN] " + msg);
    }
}