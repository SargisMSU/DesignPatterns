package patterns.behavioral.visitor;

public class ProjectClass implements ProjectElement{
    @Override
    public void accept(Developer developer) {
        developer.create(this);
    }
}
