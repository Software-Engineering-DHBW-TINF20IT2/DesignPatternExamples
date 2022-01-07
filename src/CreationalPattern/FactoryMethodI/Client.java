package CreationalPattern.FactoryMethodI;

import CreationalPattern.FactoryMethodI.Factories.AdvancedComputerStore;
import CreationalPattern.FactoryMethodI.Factories.ComputerStore;
import CreationalPattern.FactoryMethodI.Factories.StandardComputerStore;

public class Client {

    /**
     * Simply create and display computer information
     * No parameter as instantiated type defines ComputerStore
     * concrete implementation
     * @param args
     */
    public static void main(String[] args){
        // create standard computer store
        ComputerStore store1 = new StandardComputerStore();
        store1.displayComputer();

        // create advanced computer store
        ComputerStore store2 = new AdvancedComputerStore();
        store2.displayComputer();
    }
}
