package CreationalPattern.AbstractFactory.Factories;

import CreationalPattern.AbstractFactory.Products.CPU;
import CreationalPattern.AbstractFactory.Products.Keyboard;
import CreationalPattern.AbstractFactory.Products.Monitor;

/**
 * Create different product families
 * of standard and advanced computer
 */
public interface ComputerFactory {

    // Define interface to create a CPU
    CPU createCPU();

    // Define interface to create a Monitor
    Monitor createMonitor();

    // Define interface to create a Keyboard
    Keyboard createKeyboard();

}
