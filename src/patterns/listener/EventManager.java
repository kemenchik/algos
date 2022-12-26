package patterns.listener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            listeners.put(operation, new ArrayList<>());
        }
    }

    public boolean subscribe(String event, EventListener listener) {
        if (!listeners.containsKey(event)) {
            return false;
        }
        listeners.get(event).add(listener);
        return true;
    }

    public boolean unsubscribe(String event, EventListener listener) {
        if (!listeners.containsKey(event) || !listeners.get(event).contains(listener)) {
            return false;
        }
        listeners.get(event).remove(listener);
        return true;
    }

    public void notifyListeners(String event) {
        if (!listeners.containsKey(event)) {
            return;
        }
        for (EventListener listener : listeners.get(event)) {
            listener.inform();
        }
    }
}
