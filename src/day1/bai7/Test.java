package day1.bai7;

public class Test {
    static void main() {
        AppConfig appConfig = new AppConfig();
        appConfig.printPublicConfig();

//         AppConfig.DB_PASSWORD; // error can't access private field
        // AppConfig.SECRET_KEY; // error can't access private field
        // AppConfig.TIMEOUT_MS; // error can't access private field
    }
}
