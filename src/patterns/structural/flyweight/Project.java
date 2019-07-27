package patterns.structural.flyweight;

import java.util.Date;

public class Project {

    /***
     * внутренные поля
     */
    ProgrammingLanguage programmingLanguage;
    /**
     * Эти поля внешние(контекстные), поэтому предорвращаем их в аргументы методов, где они используются:
     * int price;
     * String client;
     * Date deadline
     */

    public Project(ProgrammingLanguage programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void aboutProject(int price, String client, Date deadline){
        System.out.println("---------------------------------------");
        programmingLanguage.writeCode();
        System.out.println("price = " + price);
        System.out.println("client = " + client);
        System.out.println("deadline = " + deadline);
    }
}
