package day1.bai7;

public class AppConfig {
    public static final String APP_NAME = "JavaApp", APP_VERSION = "v1.0", MAX_USERS = "100";
    private static final String DB_PASSWORD = "pass", SECRET_KEY = "abc", TIMEOUT_MS = "66";

    public void printPublicConfig() {
        System.out.printf("App: %s %s %n", APP_NAME, APP_VERSION);
        System.out.printf("Max users: %s", MAX_USERS);
    }

}
