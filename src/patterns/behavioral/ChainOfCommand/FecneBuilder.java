package patterns.behavioral.ChainOfCommand;

public class FecneBuilder extends Builder {

    public FecneBuilder(Builder next) {
        super(next);
    }

    @Override
    public boolean IBuild() {
        System.out.println("Building fence!");
        return true;
    }
}
