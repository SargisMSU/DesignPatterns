package patterns.behavioral.observer_with_jdk_classes;

import java.util.Observable;

public class MessageObserver implements java.util.Observer {
    String observerName;

    public MessageObserver(String observerName) {
        this.observerName = observerName;
    }

    public MessageObserver(String observerName, ObservableString observableString){
        this.observerName = observerName;
        observableString.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ObservableString){
            ObservableString string = (ObservableString) o;
            String observableString = string.getObservableString();
            System.out.println("Observer name: " + observerName + ", observable string: " + observableString);
        }
    }
}
