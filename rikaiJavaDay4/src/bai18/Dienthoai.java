package bai18;

public class Dienthoai extends EventManager {
    private int pin;

    void setPin(int pin) {
        this.pin = pin;
        if(pin<20){
            this.notify("pin low",pin);
        }
    }
}
