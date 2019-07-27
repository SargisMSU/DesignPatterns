package patterns.behavioral.ChainOfCommand;

public class BasementBuilder extends Builder{

    public BasementBuilder(Builder next) {
        super(next);
    }

    @Override
    public boolean IBuild() {
        System.out.println("Building basement!");
        return true;
    }
}
