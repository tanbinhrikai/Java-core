package bai18;

public class CuocGoi implements Observer {

    @Override
    public void update(String event, Object data) {
        if ("PIN_LOW".equals(event)) {
            System.out.println("[CuocGoi] Hạn chế gọi khi pin yếu!");
        }
    }
}