package BehaviouralPattern.Iterator;

import BehaviouralPattern.Iterator.AdvancedArtefacts.AdvancedComputer;
import BehaviouralPattern.Iterator.AdvancedArtefacts.AdvancedComputerList;
import BehaviouralPattern.Iterator.AdvancedArtefacts.AdvancedComputerStore;
import BehaviouralPattern.Iterator.StandardArtefacts.StandardComputer;
import BehaviouralPattern.Iterator.StandardArtefacts.StandardComputerList;
import BehaviouralPattern.Iterator.StandardArtefacts.StandardComputerStore;

import java.util.Random;

public class Client {

    AdvancedComputerList advancedComputerList;

    /**
     * initialize standard computer test list
     * @return
     */
    public static StandardComputerList initializeStandardComputerList() {
        final int amountStandardComputer = 2;
        StandardComputerList standardComputerList = new StandardComputerList();
        // add 10 computer to standard computer list from standard store
        for (int i = 0; i <amountStandardComputer; i++) {
            StandardComputer standardComputer = new StandardComputer();
            standardComputer.setPrice(Math.round(new Random().nextFloat() * 100));
            standardComputer.setDescription("This is a random generated standard product " + (i+1));
            standardComputerList.addProduct(standardComputer);
        }
        return standardComputerList;
    }

    /**
     * Initialize advanced computer test list
     * @return
     */
    public static AdvancedComputerList initializeAdvancedComputerList() {
        final int amountAdvancedComputer = 1;
        AdvancedComputerList advancedComputerList = new AdvancedComputerList();
        // add 10 computer to advanced computer list from advanced store
        for(int i=0; i<amountAdvancedComputer; i++) {
            AdvancedComputer advancedComputer = new AdvancedComputer();
            advancedComputer.setPrice(Math.round(new Random().nextFloat() * 100));
            advancedComputer.setDescription("This is a random generated advanced product " + (i+1));
            advancedComputerList.addProduct(advancedComputer);
        }
        return advancedComputerList;
    }

    public static void displayProduct(ComputerStoreIterator iterator) {
        ComputerProduct product;
        int counter = 1;
        while(iterator.hasNext()) {
            product = iterator.getNext();
            System.out.println("\nComputer " + counter + ":");
            System.out.println("Product price: " + product.getPrice());
            System.out.println("Product description: " + product.getDescription());
            counter++;
        }
    }

    public static void main(String[] args) {
        // Create list with standard and advanced computer
        AdvancedComputerList advancedComputerList = initializeAdvancedComputerList();
        StandardComputerList standardComputerList = initializeStandardComputerList();

        // use iterator to iterate standardComputerlist
        System.out.println("Show list of standard computer:");
        StandardComputerStore standardComputerStore = new StandardComputerStore();
        standardComputerStore.setStandardComputerList(standardComputerList);
        ComputerStoreIterator iteratorStandard = standardComputerStore.createIterator();
        displayProduct(iteratorStandard);

        // use iterator for advanced computer
        System.out.println("\n\nShow list of advanced computer:");
        AdvancedComputerStore advancedComputerStore = new AdvancedComputerStore();
        advancedComputerStore.setAdvancedComputerList(advancedComputerList);
        ComputerStoreIterator iteratorAdvanced = advancedComputerStore.createIterator();
        displayProduct(iteratorAdvanced);
    }

}
