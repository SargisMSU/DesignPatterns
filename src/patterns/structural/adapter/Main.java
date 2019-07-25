package patterns.structural.adapter;

public class Main {

    public static void main(String[] args) {

        USB cardReader = new CardAdapter(new MemoryCard());
        cardReader.connectWithUsbCable();

    }
}
