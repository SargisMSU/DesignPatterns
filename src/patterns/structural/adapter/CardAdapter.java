package patterns.structural.adapter;

public class CardAdapter implements USB {

    private MemoryCard memoryCard;

    public CardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUsbCable() {
        this.memoryCard.insert();
        this.memoryCard.copyData();
    }
}