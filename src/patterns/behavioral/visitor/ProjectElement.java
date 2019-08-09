package patterns.behavioral.visitor;

public interface ProjectElement {
    /**
     * метод для возм-ти обхода элементов.
     * */
    public void accept(Developer developer);
}