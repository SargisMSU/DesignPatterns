package patterns.behavioral.visitor;

public class Project implements ProjectElement{
    ProjectElement[] projectElements;

    public Project() {
        projectElements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void accept(Developer developer) {
        for (ProjectElement projectElement: projectElements) {
            projectElement.accept(developer);
        }
    }
}
