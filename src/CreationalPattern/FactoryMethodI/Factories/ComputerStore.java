package CreationalPattern.FactoryMethodI.Factories;

import CreationalPattern.FactoryMethodI.Products.Computer;

public abstract class ComputerStore {

    /**
     * display computer information by relying on
     * the computer interface
     */
    public void displayComputer() {

        Computer computer = createComputer();

        System.out.println("\nComputer:");
        computer.displayMonitorInfo();
        computer.displayCpuInfo();
        computer.displayKeyboardInfo();
        computer.displayCost();

    }

    public abstract Computer createComputer();

}
