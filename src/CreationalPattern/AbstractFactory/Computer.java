package CreationalPattern.AbstractFactory;

import CreationalPattern.AbstractFactory.Factories.AdvancedFactory;
import CreationalPattern.AbstractFactory.Factories.ComputerFactory;
import CreationalPattern.AbstractFactory.Factories.StandardFactory;
import CreationalPattern.AbstractFactory.Products.CPU;
import CreationalPattern.AbstractFactory.Products.Keyboard;
import CreationalPattern.AbstractFactory.Products.Monitor;

public class Computer {

    // usage of interfaces instead of classes
    private CPU cpu;
    private Monitor monitor;
    private Keyboard keyboard;

    // construct computer based on abstract factory pattern
    public Computer (ComputerFactory computerFactory) {
        this.cpu = computerFactory.createCPU();
        this.keyboard = computerFactory.createKeyboard();
        this.monitor = computerFactory.createMonitor();
    }

    public void showComputerParts() {
        System.out.println("\nYour computer consists of: ");
        System.out.println("1. " + this.cpu.getName());
        System.out.println("2. " + this.monitor.getName());
        System.out.println("3. " + this.keyboard.getName());
    }

    public static void main(String[] args){
        System.out.println("Create different kinds of computer");
        System.out.println("->  without using concrete classes");
        System.out.println("->  including a group of dependent objects");

        // Create advanced computer
        ComputerFactory factory1 = new AdvancedFactory();
        Computer computer1 = new Computer(factory1);
        computer1.showComputerParts();

        // Create standard computer
        ComputerFactory factory2 = new StandardFactory();
        Computer computer2 = new Computer(factory2);
        computer2.showComputerParts();
    }


}
