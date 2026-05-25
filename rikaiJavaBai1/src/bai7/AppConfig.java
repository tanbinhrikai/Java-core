package bai7;

public class AppConfig {
    public static final String APP_NAME = "JavaApp";
    public static final String APP_VERSION = "v1.0";
    public static final int MAX_USERS = 100;

    private static final String DB_PASSWORD = "123456";
    private static final String SECRET_KEY = "ABCXYZ";
    private static final int TIMEOUT_MS = 5000;

    public static void printPublicConfig() {
        System.out.println("=== App Configuration ===");
        System.out.println("App: " + APP_NAME + " " + APP_VERSION);
        System.out.println("Max users: " + MAX_USERS);
    }
}



