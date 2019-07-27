package patterns.behavioral.ChainOfCommand;

public class FloorBuilder extends Builder{

    public FloorBuilder(Builder next) {
        super(next);
    }

    @Override
    public boolean IBuild() {
        System.out.println("Building floor!");
        return true;
    }
}
