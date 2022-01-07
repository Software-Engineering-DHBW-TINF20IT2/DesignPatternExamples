package StructuralPattern.Composite;

public class Action extends MenuEntry {

    /**
     * Constructor
     * @param name
     * @param id
     */
    public Action(String name, int id) {
        setName(name);
        setId(id);
    }

    /**
     * Do specific action at leaf node
     */
    public void specialAction() {
        System.out.println("Call specific action");
    }

    /**
     * Leaf nodes can't add another entry
     * @param entry
     */
    @Override
    public void add(MenuEntry entry) {
        throw new UnsupportedOperationException();
    }

    /**
     * Leaf nodes can't remove further entries
     * @param entry
     */
    @Override
    public void remove(MenuEntry entry) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MenuEntry getChild(int id) {
        throw new UnsupportedOperationException();
    }

}
