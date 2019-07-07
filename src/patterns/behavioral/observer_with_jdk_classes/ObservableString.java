package patterns.behavioral.observer_with_jdk_classes;

import java.util.Observable;

public class ObservableString extends Observable {
    String observableString;

    public ObservableString(String observableString) {
        this.observableString = observableString;
    }

    public void setObservableString(String observableString) {
        this.observableString = observableString;
        setChanged();
        notifyObservers();
    }

    public String getObservableString() {
        return observableString;
    }
}
