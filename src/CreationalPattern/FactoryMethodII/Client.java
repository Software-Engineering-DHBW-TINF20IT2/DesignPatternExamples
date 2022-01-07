package CreationalPattern.FactoryMethodII;

import CreationalPattern.FactoryMethodII.Factories.AdvancedComputerStore;
import CreationalPattern.FactoryMethodII.Factories.ComputerStore;
import CreationalPattern.FactoryMethodII.Factories.StandardComputerStore;

public class Client {


    /**
     * Main method shows wrong computer types if parameter
     * is not supported
     * @param args
     */
    public static void main(String[] args){
        // create type 1
        ComputerStore store1 = new StandardComputerStore();
        store1.displayComputer("Standard");

        // create type 2
        ComputerStore store2 = new AdvancedComputerStore();
        store2.displayComputer("Advanced");

        // create type 3
        ComputerStore store3 = new AdvancedComputerStore();
        store2.displayComputer("Special");
    }
}
