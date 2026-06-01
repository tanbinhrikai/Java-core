package bai18;

public class CuocGoi implements Observer{

    @Override
    public void update(String event, Object data) {
        System.out.println("han che cuco goi khi pin yeu");
    }
}
