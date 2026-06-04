package day4.bai18;

public class TinNhan implements Observer {
    @Override
    public void update(String event, Object data) {
        if(event.equals("TIN_NHAN")) {
            System.out.println(data);
        }
    }
}
