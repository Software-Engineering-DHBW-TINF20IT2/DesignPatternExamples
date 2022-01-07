package StructuralPattern.Facade;

/**
 * Generic Sensor Class
 */
public class Sensor {

    private int id;
    private String name;
    private String filename;

    public Sensor(int id, String name, String filename) {
        this.id = id;
        this.name = name;
        this.filename = filename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
