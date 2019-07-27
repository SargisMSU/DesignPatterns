package patterns.structural.flyweight;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        ProgrammingLanguage java = ProgrammingLanguageFactory.getLanguage("JAVA");
        ProgrammingLanguage cpp = ProgrammingLanguageFactory.getLanguage("CPP");

        Project projectJava = new Project(java);
        Project projectJava1 = new Project(java);
        Project projectJava2 = new Project(java);
        Project projectCpp = new Project(cpp);
        Project projectCpp1 = new Project(cpp);
        Project projectCpp2 = new Project(cpp);
        Project projectCpp3 = new Project(cpp);

        projectJava.aboutProject(500, "Client1", new Date());
        projectJava1.aboutProject(400, "Client2", new Date());
        projectJava2.aboutProject(600, "Client3", new Date());
        projectCpp.aboutProject(5500, "Client4", new Date());
        projectCpp1.aboutProject(5200, "Client5", new Date());
        projectCpp2.aboutProject(1500, "Client6", new Date());
        projectCpp3.aboutProject(3500, "Client7", new Date());
    }
}
