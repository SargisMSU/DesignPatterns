package patterns.behavioral.ChainOfCommand;

public abstract class Builder {
    private Builder next;

    public Builder(Builder next) {
        this.next = next;
    }

    /**
     * в ответ получаем надо ли продолжать дальше по цепочке или нет.
     * */
    public abstract boolean IBuild();

    void build(){
        boolean toBeContinued = IBuild();
        if (toBeContinued && this.next != null){
            this.next.build();
        }
    }
}
