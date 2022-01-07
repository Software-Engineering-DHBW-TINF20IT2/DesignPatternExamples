package CreationalPattern.FactoryMethodII.Factories;

import CreationalPattern.FactoryMethodII.Products.Computer;

public abstract class ComputerStore {

    /**
     * display computer information by relying on
     * the computer interface
     */
    public void displayComputer(String computerType) {

        Computer computer = createComputer(computerType);

        System.out.println("\nDisplay computer type " + computerType);
        computer.displayMonitorInfo();
        computer.displayCpuInfo();
        computer.displayKeyboardInfo();
        computer.displayCost();

    }

    public abstract Computer createComputer(String computerType);

}
