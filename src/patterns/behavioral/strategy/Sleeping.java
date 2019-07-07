package patterns.behavioral.strategy;

public class Sleeping implements Action {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
