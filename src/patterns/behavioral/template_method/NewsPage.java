package patterns.behavioral.template_method;

public class NewsPage extends WebsiteTemplate{
    @Override
    void showContent() {
        System.out.println("News");
    }
}
