package bai18;

public class TinNhan implements Observer{

    @Override
    public void update(String event, Object data) {
        System.out.println("han che tin nhan khi pin yeu");
    }
}
