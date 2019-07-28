package patterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        JavaDeveloper sargis = new JavaDeveloper("Sargis", new String[]{"Java", "Maven", "Git"});

        Iterator iterator = sargis.getIterator();
        System.out.println("Developer: " + sargis.getName());
        System.out.print("Skills: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
