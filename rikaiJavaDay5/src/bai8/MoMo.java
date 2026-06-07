package bai8;

public class Momo extends Payment{
    private String phoneNumber;
    public void  sendCashback(){
        System.out.println("hoan tien len toi 2%");
    }

    @Override
    public void process() {
        System.out.println("thanh toan bang momo");
    }


}
