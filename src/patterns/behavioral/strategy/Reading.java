package patterns.behavioral.strategy;

public class Reading implements Action {
    @Override
    public void justDoIt() {
        System.out.println("Reading...");
    }
}
