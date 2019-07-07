package patterns.behavioral.strategy;

public class Developer {
    private Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void execute(){
        action.justDoIt();
    }
}
