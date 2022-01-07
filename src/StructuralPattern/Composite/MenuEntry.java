package StructuralPattern.Composite;

public abstract class MenuEntry {

    private int id;
    private String name;

    // Getter and setter
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


    // Common methods
    public void print(MenuEntry entry) {
        System.out.println("Menue entry '" + this.getName() + "' with id " + this.getId());
    }

    // methods to be implemented by leaf / composite
    /**
     * Add entry to menu
     * @param entry
     */
    public abstract void add(MenuEntry entry);


    /**
     * Remove entry from menu
     * @param entry
     */
    public abstract void remove(MenuEntry entry);


    /**
     * get specific sub entry
     * @param id
     */
    public abstract MenuEntry getChild(int id);

}
