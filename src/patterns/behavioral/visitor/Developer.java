package patterns.behavioral.visitor;
/**
 * Это наш VISITOR
 * */
public interface Developer {
    public void create(ProjectClass projectClass);

    public void create(Test test);

    public void create(Database database);
}
