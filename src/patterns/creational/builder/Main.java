package patterns.creational.builder;

import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        WebSite site = new WebSite.
                Builder("SiteName", "http://www.google.ru")
                .withLanguage(ProgrammingLanguage.JAVA)
                .withPrice(50000)
                .build();
        System.out.println("site = " + site);
    }
}
