package patterns.behavioral.visitor;

public class Database implements ProjectElement{
    @Override
    public void accept(Developer developer) {
        developer.create(this);
    }
}
