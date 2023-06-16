package mvc;

import java.util.ArrayList;
import java.util.List;

class Digiworld {
    private List<Observer> tamers = new ArrayList<>();

    public void addObserver(Observer tamer) {
        tamers.add(tamer);
    }

    public void notifyAllObservers(String message) {
        for (Observer tamer : tamers) {
            tamer.update(message);
        }
    }
}

