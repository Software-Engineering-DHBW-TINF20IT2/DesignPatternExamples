package CreationalPattern.FactoryMethodI.Products;

public class AdvancedComputer implements Computer {
    @Override
    public void displayMonitorInfo() {
        System.out.println("Monitor (Advanced)");
    }

    @Override
    public void displayCpuInfo() {
        System.out.println("CPU (Advanced)");
    }

    @Override
    public void displayKeyboardInfo() {
        System.out.println("Keyboard (Advanced)");
    }

    @Override
    public void displayCost() {
        System.out.println("700 EUR (Advanced)");
    }
}
