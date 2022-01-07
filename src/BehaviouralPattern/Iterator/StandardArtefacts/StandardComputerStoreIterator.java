package BehaviouralPattern.Iterator.StandardArtefacts;

import BehaviouralPattern.Iterator.ComputerProduct;
import BehaviouralPattern.Iterator.ComputerStoreIterator;

public class StandardComputerStoreIterator extends ComputerStoreIterator {
    StandardComputerList products;

    StandardComputerStoreIterator(StandardComputerList products) {
        this.products = products;
    };

    /**
     * Determine if more products are available
     * @return
     */
    public boolean hasNext() {
        boolean isNextProductAvailable = false;
        if(this.getPosition() < products.size()) {
            isNextProductAvailable=true;
        }
        return isNextProductAvailable;
    }

    /**
     * If more products are available get the next one
     * @return
     */
    public ComputerProduct getNext(){
        ComputerProduct product = null;
        int nextItem = getPosition();

        if(hasNext()) {
            product = products.getStandardProduct(nextItem);
            nextItem = nextItem+1;
            setPosition(nextItem);
        }

        return product;

    }


}
