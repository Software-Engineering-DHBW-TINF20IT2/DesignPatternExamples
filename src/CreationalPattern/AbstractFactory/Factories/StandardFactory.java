package CreationalPattern.AbstractFactory.Factories;

import CreationalPattern.AbstractFactory.Products.*;

public class StandardFactory implements ComputerFactory {
    /**
     * Create a standard CPU
     * @return CPU
     */
    @Override
    public CPU createCPU() {
        return new StandardCPU();
    }

    /**
     * Create a standard Monitor
     * @return Keyboard
     */
    @Override
    public Monitor createMonitor() {
        return new StandardMonitor();
    }


    /**
     * Create a standard Keyboard
     * @return Keyboard
     */
    @Override
    public Keyboard createKeyboard() {
        return new StandardKeyboard();
    }

}
