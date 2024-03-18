package tools;
import java.util.*;
import java.io.*;

public class Publisher implements Serializable {
    private LinkedList<Subscriber> observers= new LinkedList<Subscriber>();
    public void unsubscribe(Subscriber s) {observers.remove(s);}
    public void subscribe(Subscriber s) {observers.add(s);}
    public void notifySubscribers() {
        for (Subscriber s: observers) {
            s.update();
        }
    }
}
