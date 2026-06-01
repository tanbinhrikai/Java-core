package bai18;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<Observer> observers = new ArrayList<Observer>();
    public void attach(Observer observer){
        this.observers.add(observer);

    }
    public void detach(Observer observer){
        this.observers.remove(observer);
    }

    void notify(String event, Object data) {
        for (Observer o : observers) {
            o.update(event, data);
        }
    }
}
