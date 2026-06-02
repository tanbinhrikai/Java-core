package bai4;

public class HetVeException extends Exception {
    public HetVeException(String event,int soVeConLai) {
        super("het ve "+ event +  "con "+soVeConLai );
    }
}
