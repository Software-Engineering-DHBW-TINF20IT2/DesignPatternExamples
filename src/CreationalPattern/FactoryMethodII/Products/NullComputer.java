package CreationalPattern.FactoryMethodII.Products;

public class NullComputer implements Computer {
    @Override
    public void displayMonitorInfo() {
        System.out.println("No supported Monitor");
    }

    @Override
    public void displayCpuInfo() {
        System.out.println("No supported Cpu");
    }

    @Override
    public void displayKeyboardInfo() {
        System.out.println("No supported Keyboard");
    }

    @Override
    public void displayCost() {
        System.out.println("Not supported");
    }
}
