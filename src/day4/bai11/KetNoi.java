package day4.bai11;

public class KetNoi {
    private String host;
    private int port;
    private KetNoi(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public static KetNoi taoMoi(String host, int port) {
        return new KetNoi(host, port);
    }

    public static KetNoi taoTuChuoi(String s) {
        String[] info = s.split(":");
        return new KetNoi(info[0], Integer.parseInt(info[1]));
    }

    public static KetNoi taoMacDinh() {
        return new KetNoi("localhost", 3306);
    }

    public boolean isValid() {
        if(host.isBlank())
            return false;
        if(port < 1 || port > 65535)
            return false;
        return  true;
    }

    @Override
    public String toString() {
        return "KetNoi{" +
                "host='" + host + '\'' +
                ", port=" + port +
                '}';
    }
}
