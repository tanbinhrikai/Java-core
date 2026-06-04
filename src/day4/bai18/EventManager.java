package day4.bai18;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    List<Observer> observers = new ArrayList<>();
    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer o) {
        observers.remove(o);
        System.out.println("Da detach");
    }

    public void notifyy(String event, Object data) {
        for(Observer o : observers) {
            o.update(event, data);
        }
    }
}
