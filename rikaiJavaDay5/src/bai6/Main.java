package bai6;

public class Main {
    public static void main(String[] args) {

        Logger console = new ConsoleLogger();

        console.logInfo("Start app");
        console.logWarning("Low memory");
        console.logError("Crash happened");

        Logger file = new FileLogger("log.txt");

        file.logInfo("Save to file");
        file.logError("File error");
    }
}