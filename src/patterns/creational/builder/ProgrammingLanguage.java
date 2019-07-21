package patterns.creational.builder;

public enum  ProgrammingLanguage {
    JAVA("java"), CPP("c++"), JAVASCRIPT("javascript"),
    PYTHON("python"), C("c"), C_SHARP("c sharp");

    private String name;

    ProgrammingLanguage(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
