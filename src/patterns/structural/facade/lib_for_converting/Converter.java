package patterns.structural.facade.lib_for_converting;

public class Converter {

    private String fileName;
    private ConvertingAlgorithm convertingAlgorithm;

    public Converter(String fileName, ConvertingAlgorithm convertingAlgorithm) {
        this.fileName = fileName;
        this.convertingAlgorithm = convertingAlgorithm;
        System.out.println("new Converter!");
    }

    public void convert(){
        if (!fileName.substring(fileName.indexOf(".") + 1).equals("mp4")) {
            System.out.println("converting!");
        }
    }
}
