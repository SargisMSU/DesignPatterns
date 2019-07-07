package patterns.behavioral.observer_with_jdk_classes;

public class Runner {

    public static void main(String[] args) {
        ObservableString observableString = new ObservableString("string1");
        MessageObserver observer = new MessageObserver("Observer1");
        new MessageObserver("Observer2", observableString);
        observableString.addObserver(observer);
        observableString.setObservableString("string2");
        observableString.setObservableString("string3");
        observableString.setObservableString("string4");
        observableString.setObservableString("string5");
        observableString.setObservableString("string6");
        observableString.setObservableString("string7");
    }
}
