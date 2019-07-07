package patterns.creational.factory;

public class SimpleDeveloperFactory {
    public static DeveloperFactory createDeveloperFactory(String type){
        switch (type){
            case "Java": return new JavaDeveloperFactory();
            case "Cpp": return new CppDeveloperFactory();
            default: return null;
        }
    }
}
