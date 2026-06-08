package bai18;

public class DienThoai extends EventManager {

    private int pin;

    public void setPin(int pin) {
        this.pin = pin;

        notify("PIN_CHANGE", pin);
        if(pin<20){
            notify("PIN_LOW", pin);
        }

    }


    public int getPin() {
        return pin;
    }
}