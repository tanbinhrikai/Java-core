package day4.bai18;

public class DienThoai extends EventManager {
    int mucPin;

    public void goiDienThoai() {
        if(mucPin < 20) {
            notifyy("CUOC_GOI", "Han che goi dien thoai khi pin yeu");
        }
    }

    public void setMucPin(int mucPin) {
        this.mucPin = mucPin;
        if(this.mucPin < 20)
            notifyy("PIN_YEU", String.format("Pin %d%% (<20%%)", mucPin));
        this.mucPin = mucPin;
    }
}
