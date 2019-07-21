package patterns.creational.builder;

import java.net.MalformedURLException;
import java.net.URL;

public class WebSite {

    private final String name;
    private final URL url;
    private final Integer price;
    private final ProgrammingLanguage language;

    private WebSite(Builder builder){
        this.name = builder.name;
        this.url = builder.url;
        this.price = builder.price;
        this.language = builder.language;
    }

    public String getName() {
        return name;
    }

    public URL getUrl() {
        return url;
    }

    public int getPrice() {
        return price;
    }

    public ProgrammingLanguage getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("WebSite{" +
                "name='" + name + '\'' +
                ", url=" + url);
        if (price != null) {
            builder.append(", price=" + price);
        }
        if (language != null){
            builder.append(", language=" + language);
        }
        builder.append('}');
        return builder.toString();
    }

    public static class Builder{
        private final String name;
        private final URL url;
        private Integer price;
        private ProgrammingLanguage language;

        public Builder(String name, String url) throws MalformedURLException {
            if (name == null || url == null){
                throw new IllegalArgumentException("name and url cannot be null");
            }
            this.name = name;
            this.url = new URL(url);
        }

        public Builder withPrice(int price){
            this.price = price;
            return this;
        }

        public Builder withLanguage(ProgrammingLanguage language){
            this.language = language;
            return this;
        }

        public WebSite build(){
            return new WebSite(this);
        }
    }

}
