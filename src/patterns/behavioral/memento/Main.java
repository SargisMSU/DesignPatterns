package patterns.behavioral.memento;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        MementoWrapper mementoWrapper = new MementoWrapper();

        System.out.println("Создание объекта...");
        project.setVersionAndDate("Version 1.0");

        System.out.println("project = " + project);

        Thread.sleep(2000);

        System.out.println("Сохранение сосотояния...");
        mementoWrapper.setMemento(project.save());

        System.out.println("Обновление объекта...");
        project.setVersionAndDate("Version 1.1");

        System.out.println("project = " + project);

        System.out.println("Восстановление состояния...");
        project.load(mementoWrapper.getMemento());

        System.out.println("project = " + project);
    }
}
