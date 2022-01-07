package StructuralPattern.Facade;

public class Client {


    public static void main(String[] args) {
        Sensor sensor = new Sensor(1,
                "temperature",
                "temperature_in_space.csv");
        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.enableSensor(sensor);
    }

}
