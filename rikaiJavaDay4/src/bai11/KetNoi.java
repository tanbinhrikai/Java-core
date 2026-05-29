package bai11;

public class KetNoi {
    private String host;
    private  int port;

    public static String macDinh = "localhost:3306";


    private KetNoi(String host , int port){
        this.host = host ;
        this.port = port;
    }
     public static  KetNoi taoMoi(String host,int port){
         return new KetNoi(host,port);

    }

    public static KetNoi taoTuChuoi(String chuoi){
        String[] inputs =chuoi.split(":");
        String host = inputs[0];
        int port = Integer.parseInt(inputs[1]);
        return  new KetNoi(host,port);
    }

    public static KetNoi taoMacDinh(){
        String[] inputs =macDinh.split(":");
        String host = inputs[0];
        int port = Integer.parseInt(inputs[1]);
        return new KetNoi(host,port);
    }

    public boolean isValid(){
        if(host==null||host.isBlank()){
            return  false;
        }
        if(port<=0||port>65535){
            return  false;
        }
        return true;
    }
}
