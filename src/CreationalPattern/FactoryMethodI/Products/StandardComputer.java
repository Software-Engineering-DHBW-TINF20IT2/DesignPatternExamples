package CreationalPattern.FactoryMethodI.Products;

public class StandardComputer implements Computer {
    @Override
    public void displayMonitorInfo() {
        System.out.println("Monitor (Stanadrd)");
    }

    @Override
    public void displayCpuInfo() {
        System.out.println("CPU (Stanadrd)");
    }

    @Override
    public void displayKeyboardInfo() {
        System.out.println("Keyboard (Stanadrd)");
    }

    @Override
    public void displayCost() {
        System.out.println("250 EUR (Stanadrd)");
    }
}
