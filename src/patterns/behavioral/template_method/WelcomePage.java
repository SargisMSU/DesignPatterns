package patterns.behavioral.template_method;

public class WelcomePage extends WebsiteTemplate{
    @Override
    void showContent() {
        System.out.println("Welcome");
    }
}
