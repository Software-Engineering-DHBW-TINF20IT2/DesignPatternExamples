package BehaviouralPattern.Iterator;

public abstract class ComputerStoreIterator {

    private int position;

    // constructor
    public ComputerStoreIterator() {
        this.position = 0;
    };

    // getter and setter
    public int getPosition() {
        return this.position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    // common methods
    public void reset(){
        this.position = 0;
    }

    // abstract methods
    public abstract boolean hasNext();
    public abstract ComputerProduct getNext();

}
