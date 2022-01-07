package StructuralPattern.Facade;

import StructuralPattern.Facade.Subsystems.*;

/**
 * Class to control sensor system
 */
public class SensorSystem {

    /**
     * Enable a sensor in space and get
     * data send to earth
     * @param sensor
     */
    public void enableSensor(Sensor sensor) {
        System.out.println("SensorSystem | Enable Sensor: Nr->" + sensor.getId() + ",Name->" + sensor.getName() + ",Filename->" + sensor.getFilename());

        // create object for serial communication
        SerialComm comm = new SerialComm();
        comm.setCommPort(1);
        comm.setBaudRate(9600);
        comm.setParity(0);
        comm.setByteSize(8);
        comm.setStopBits(1);

        // start get data
        comm.openSerialCommunication();

        // start data analyzer and write to file system
        DataAnalyzer analyzer = new DataAnalyzer(comm);
        analyzer.analyzeData(sensor);

        // open wireless connection
        WirelessComm wComm = new WirelessComm();

        // send to earth
        wComm.sendDataToEarth();

        System.out.println("\nSensorSystem | done.");
    }

    public void enableAllSensors() {

    }


    public void disableSensor(int sensorNum) {

    }

    public void disableAllSensors() {

    }

    public void transmitSensorData(int sensorNum) {

    }

    public void transmitAllSensorData() {

    }

    public void scheduleCollection() {

    }

}
