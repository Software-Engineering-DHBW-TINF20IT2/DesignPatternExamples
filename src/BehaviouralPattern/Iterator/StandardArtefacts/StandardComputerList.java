package BehaviouralPattern.Iterator.StandardArtefacts;

import java.util.ArrayList;

public class StandardComputerList {

    ArrayList<StandardComputer> products = new ArrayList<>();
    int position = 0;

    /**
     * get size of product list
     * @return
     */
    public int size() {
        return this.products.size();
    }

    /**
     * get current position
     * @return
     */
    public int getPosition(){
        return this.position;
    }

    /**
     * Add product to product list
     * @param standardComputer
     */
    public void addProduct(StandardComputer standardComputer){
        this.products.add(standardComputer);
    }

    /**
     * Get specific product
     * @param position
     * @return
     */
    public StandardComputer getStandardProduct(int position) {
        return this.products.get(position);
    }

}
