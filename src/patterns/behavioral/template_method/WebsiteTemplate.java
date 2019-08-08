package patterns.behavioral.template_method;

public abstract class WebsiteTemplate {
    public void show(){
        showHeader();
        showContent();
        showFooter();
    }

    private void showHeader() {
        System.out.println("Header");
    }

    private void showFooter() {
        System.out.println("Footer");
    }

    abstract void showContent();
}
