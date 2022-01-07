package CreationalPattern.FactoryMethodII.Factories;

import CreationalPattern.FactoryMethodII.Products.AdvancedComputer;
import CreationalPattern.FactoryMethodII.Products.Computer;
import CreationalPattern.FactoryMethodII.Products.NullComputer;

public class AdvancedComputerStore extends ComputerStore {

    @Override
    public Computer createComputer(String computerType){
        if (computerType.toUpperCase().equals("ADVANCED")) {
            return new AdvancedComputer();
        } else {
            return new NullComputer();
        }
    }
}
