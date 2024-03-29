package patterns.behavioral.visitor;

public class JuniorDeveloper implements Developer{

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor class...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating not reliable test...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Drop database...");
    }
}
