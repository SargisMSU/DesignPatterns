package patterns.structural.flyweight;

import java.util.HashMap;

public class ProgrammingLanguageFactory {

    private static HashMap<String, ProgrammingLanguage> cash = new HashMap<>();

    public static ProgrammingLanguage getLanguage(String language){
        ProgrammingLanguage programmingLanguage;
        switch (language){
            case "JAVA":{
                if (cash.get("JAVA") == null){
                    programmingLanguage = new Java();
                    cash.put("JAVA", programmingLanguage);
                }
                break;
            }
            case "CPP":{
                if (cash.get("CPP") == null){
                    programmingLanguage = new CPP();
                    cash.put("CPP", programmingLanguage);
                }
                break;
            }
            default:
                break;
        }
        return cash.get(language);
    }
}
