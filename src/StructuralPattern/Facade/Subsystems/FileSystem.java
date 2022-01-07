package StructuralPattern.Facade.Subsystems;

import StructuralPattern.Facade.Sensor;

/**
 * Class to write / read data
 * from / to filesystem
 */
public class FileSystem {

    /**
     * Write message to file system
     * @param message
     */
    public void writeToFileSystem(String filename, String message) {
        System.out.println("\nDataAnalyzer | Write "+  "'" + message + "'" + " to " + filename);
    }

    /**
     * F
     * @param sensor
     * @return
     */
    public String readFromFilesystem(Sensor sensor){
        System.out.println("\nDataAnalyzer | Read " +  "'...'" + " from " + sensor.getFilename());
        return "data...";
    }

}
