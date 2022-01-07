package StructuralPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class ActionGroup extends MenuEntry {

    List<MenuEntry> itemList = new ArrayList<>();

    /**
     * Consructor for base action group
     * @param name
     * @param id
     */
    ActionGroup(String name, int id) {
        setName(name);
        setId(id);
    }

    /**
     * Add item to menue entry
     * @param entry
     */
    @Override
    public void add(MenuEntry entry) {
        itemList.add(entry);
    }

    /**
     * Remove entry from menue entry
     * @param entry
     */
    @Override
    public void remove(MenuEntry entry) {
        itemList.remove(entry);
    }

    @Override
    public MenuEntry getChild(int id) {
        return itemList.get(id);
    }

    /**
     * print item and it's subitems
     */
    @Override
    public void print(MenuEntry entry) {
        System.out.println("Menue entry '" + this.getName() + "' with id " + this.getId());
        for(MenuEntry item : itemList) {
            item.print(item);
        }
    }

}
