package patterns.behavioral.template_method;

public class WebsiteRunner{
    public static void main(String[] args) {
        NewsPage newsPage = new NewsPage();
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.show();
        System.out.println("-------------------------");
        newsPage.show();
    }
}
