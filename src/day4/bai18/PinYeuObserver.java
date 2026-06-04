package day4.bai18;

public class PinYeuObserver implements Observer{
    @Override
    public void update(String event, Object data) {
        if(event.equals("PIN_YEU")) {
            System.out.printf("[%s] %s %n", "PinYeuObserver", data.toString());
        }
    }
}
