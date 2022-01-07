package StructuralPattern.Facade.Subsystems;

/**
 * Class to control serial communication
 * with sensors
 */
public class SerialComm {

    private int commPort;
    private int baudRate;
    private int parity;
    private int byteSize;
    private int stopBits;

    // Getter und Setter
    public int getCommPort() {
        return commPort;
    }

    public void setCommPort(int commPort) {
        this.commPort = commPort;
    }

    public int getBaudRate() {
        return baudRate;
    }

    public void setBaudRate(int baudRate) {
        this.baudRate = baudRate;
    }

    public int getParity() {
        return parity;
    }

    public void setParity(int parity) {
        this.parity = parity;
    }

    public int getByteSize() {
        return byteSize;
    }

    public void setByteSize(int byteSize) {
        this.byteSize = byteSize;
    }

    public int getStopBits() {
        return stopBits;
    }

    public void setStopBits(int setStopBits) {
        this.stopBits = setStopBits;
    }

    /**
     * Open Serial communication to sensor
     * @return
     */
    public boolean openSerialCommunication() {
        System.out.println("\nSerialComm | Open serial communication connection");
        System.out.println("CommPort: " + this.getCommPort());
        System.out.println("BaudeRate: " + this.getBaudRate());
        System.out.println("ParityBit: " + this.getParity());
        System.out.println("ByteSize: " + this.getByteSize());
        System.out.println("StopBits: " + this.getStopBits());
        return true;
    }

    /**
     * Read incoming data
     * @return
     */
    public String readData() {
        System.out.println("\nSerialComm | Read some data from sensor");
        return "010003020300300...";
    }

}
