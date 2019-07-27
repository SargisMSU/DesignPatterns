package patterns.behavioral.ChainOfCommand;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        new BasementBuilder(
                new FloorBuilder(
                        new RoofBuilder(
                                new FecneBuilder(null)))).build();
    }
}
