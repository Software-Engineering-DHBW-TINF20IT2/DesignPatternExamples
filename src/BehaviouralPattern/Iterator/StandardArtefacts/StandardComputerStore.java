package BehaviouralPattern.Iterator.StandardArtefacts;

import BehaviouralPattern.Iterator.ComputerStore;
import BehaviouralPattern.Iterator.ComputerStoreIterator;

public class StandardComputerStore implements ComputerStore {
    private StandardComputerList standardComputerList;

    public StandardComputerList getStandardComputerList() {
        return standardComputerList;
    }

    public void setStandardComputerList(StandardComputerList standardComputerList) {
        this.standardComputerList = standardComputerList;
    }

    @Override
    public ComputerStoreIterator createIterator() {
        return new StandardComputerStoreIterator(standardComputerList);
    }
}
