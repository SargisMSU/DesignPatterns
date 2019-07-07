package patterns.behavioral.strategy;

public class Runner {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setAction(new Coding());
        developer.execute();

        developer.setAction(new Sleeping());
        developer.execute();

        developer.setAction(new Reading());
        developer.execute();
    }
}
