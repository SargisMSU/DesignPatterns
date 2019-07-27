package patterns.behavioral.ChainOfCommand;

public class RoofBuilder extends Builder {

    public RoofBuilder(Builder next) {
        super(next);
    }

    @Override
    public boolean IBuild() {
        System.out.println("Building roof!");
        return true;
    }
}
