package bai4;

public class HetVeException extends Exception {

    public HetVeException(String event, int soVeConLai) {
        super("Het ve " + event + " (con " + soVeConLai + " ve)");
    }
}