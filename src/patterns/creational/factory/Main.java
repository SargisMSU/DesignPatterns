package patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory factory = SimpleDeveloperFactory.createDeveloperFactory("Cpp");

        if (factory != null) {
            Developer developer = factory.createDeveloper();
            developer.writeCode();
        }
    }
}
