package CreationalPattern.AbstractFactory.Factories;

import CreationalPattern.AbstractFactory.Products.*;

public class AdvancedFactory implements ComputerFactory {

    /**
     * Create an advanced CPU
     * @return CPU
     */
    @Override
    public CPU createCPU() {
        return new AdvancedCPU();
    }

    /**
     * Create an advanced Monitor
     * @return Keyboard
     */
    @Override
    public Monitor createMonitor() {
        return new AdvancedMonitor();
    }


    /**
     * Create an advanced Keyboard
     * @return Keyboard
     */
    @Override
    public Keyboard createKeyboard() {
        return new AdvancedKeyboard();
    }
}
