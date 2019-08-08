package patterns.behavioral.state;

public class DeveloperDay {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Reading());
        developer.justDoIt();

        developer.setActivity(new Coding());
        developer.justDoIt();

        developer.setActivity(new Sleeping());
        developer.justDoIt();
    }
}