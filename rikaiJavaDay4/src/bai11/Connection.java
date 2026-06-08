package bai11;

public class Connection {

    private String host;
    private int port;

    private static final String DEFAULT = "localhost:3306";

    private Connection(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public static Connection create(String host, int port) {
        return new Connection(host, port);
    }

    public static Connection fromString(String value) {
        String[] parts = value.split(":");
        String host = parts[0];
        int port = Integer.parseInt(parts[1]);
        return new Connection(host, port);
    }

    public static Connection defaultConnection() {
        return fromString(DEFAULT);
    }

    public boolean isValid() {
        if (host == null || host.isBlank()) return false;
        if (port <= 0 || port > 65535) return false;
        return true;
    }

    @Override
    public String toString() {
        return host + ":" + port;
    }
}