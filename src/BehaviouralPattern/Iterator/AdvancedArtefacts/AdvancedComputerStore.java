package BehaviouralPattern.Iterator.AdvancedArtefacts;

import BehaviouralPattern.Iterator.ComputerStore;
import BehaviouralPattern.Iterator.ComputerStoreIterator;

public class AdvancedComputerStore implements ComputerStore {
    AdvancedComputerList advancedComputerList;

    public AdvancedComputerList getAdvancedComputerList() {
        return advancedComputerList;
    }

    public void setAdvancedComputerList(AdvancedComputerList advancedComputerList) {
        this.advancedComputerList = advancedComputerList;
    }

    @Override
    public ComputerStoreIterator createIterator() {
        return new AdvancedComputerStoreIterator(advancedComputerList);
    }
}
