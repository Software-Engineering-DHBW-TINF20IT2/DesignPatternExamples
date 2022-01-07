package StructuralPattern.Facade.Subsystems;

import StructuralPattern.Facade.Sensor;

/**
 * Class to analyze different data streams
 */
public class DataAnalyzer {

    private SerialComm serialComm;
    private FileSystem fileSystem;

    public DataAnalyzer(SerialComm comm) {
        this.serialComm = comm;
        fileSystem = new FileSystem();
    }

    /**
     * Analyze data stream
     * @param sensor
     */
    public void analyzeData(Sensor sensor) {
        String data = serialComm.readData();

        System.out.println("\nDataAnalyzer | Analyze Data Stream from " + sensor.getName());
        // code to analyze data stream...

        fileSystem.writeToFileSystem(sensor.getFilename(), data);
    }

}
