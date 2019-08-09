package patterns.behavioral.visitor;

public class Test implements ProjectElement {
    @Override
    public void accept(Developer developer) {
        developer.create(this);
    }
}
