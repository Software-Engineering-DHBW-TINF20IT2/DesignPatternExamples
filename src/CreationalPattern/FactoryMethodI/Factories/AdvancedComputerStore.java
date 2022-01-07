package CreationalPattern.FactoryMethodI.Factories;

import CreationalPattern.FactoryMethodI.Products.AdvancedComputer;
import CreationalPattern.FactoryMethodI.Products.Computer;

public class AdvancedComputerStore extends ComputerStore {

    @Override
    public Computer createComputer(){
        return new AdvancedComputer();
    }
}
