package CreationalPattern.AbstractFactory.Products;

public class StandardCPU implements CPU {
    @Override
    public String getName() {
        return "CPU (Standard)";
    }
}
