package bai18;

import java.util.ArrayList;
import java.util.List;

public class EventManager {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public void notify(String event, Object data) {
        for (Observer o : observers) {
            o.update(event, data);
        }
    }
}