package CreationalPattern.FactoryMethodI.Factories;

import CreationalPattern.FactoryMethodI.Products.Computer;
import CreationalPattern.FactoryMethodI.Products.StandardComputer;

public class StandardComputerStore extends ComputerStore {

    @Override
    public Computer createComputer(){
        return new StandardComputer();
    }

}
