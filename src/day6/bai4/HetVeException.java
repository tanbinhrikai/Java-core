package day6.bai4;

public class HetVeException extends RuntimeException {
    public HetVeException(String event, int soVeConLai) {
        super(String.format("HetVeException: Het ve %s (con %d)", event, soVeConLai));
    }
}
