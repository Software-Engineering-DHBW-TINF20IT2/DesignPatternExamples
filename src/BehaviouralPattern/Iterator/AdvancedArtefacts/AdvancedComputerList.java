package BehaviouralPattern.Iterator.AdvancedArtefacts;

import BehaviouralPattern.Iterator.StandardArtefacts.StandardComputer;

import java.util.ArrayList;

public class AdvancedComputerList {
    ArrayList<AdvancedComputer> products = new ArrayList<>();
    int position = 0;

    /**
     * return size of list
     * @return
     */
    public int size() {
        return products.size();
    }

    /**
     * get prosition in list
     * @return
     */
    public int getPosition(){
        return position;
    }

    /**
     * Get advanced product from list
     * @param position
     * @return
     */
    public AdvancedComputer getAdvancedProduct(int position) {
        return products.get(position);
    }

    /**
     * Add advanced product to list
     * @param advancedComputer
     */
    public void addProduct(AdvancedComputer advancedComputer){
        this.products.add(advancedComputer);
    }
}
