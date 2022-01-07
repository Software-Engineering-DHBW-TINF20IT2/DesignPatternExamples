package CreationalPattern.FactoryMethodII.Factories;

import CreationalPattern.FactoryMethodII.Products.Computer;
import CreationalPattern.FactoryMethodII.Products.NullComputer;
import CreationalPattern.FactoryMethodII.Products.StandardComputer;

public class StandardComputerStore extends ComputerStore {

    @Override
    public Computer createComputer(String computerType){
        if (computerType.toUpperCase().equals("STANDARD")) {
            return new StandardComputer();
        } else {
            return new NullComputer();
        }
    }

}
