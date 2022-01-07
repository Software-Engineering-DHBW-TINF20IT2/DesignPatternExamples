package BehaviouralPattern.Iterator.AdvancedArtefacts;

import BehaviouralPattern.Iterator.ComputerProduct;
import BehaviouralPattern.Iterator.ComputerStoreIterator;

public class AdvancedComputerStoreIterator extends ComputerStoreIterator {
    AdvancedComputerList products;

    public AdvancedComputerStoreIterator(AdvancedComputerList products) {
        this.products = products;
    }


    /**
     * Determine if more products are available
     * @return
     */
    @Override
    public boolean hasNext() {
        boolean nextProductAvailable = false;
        if (this.getPosition() < products.size()) {
            nextProductAvailable = true;
        }
        return nextProductAvailable;
    }

    /**
     * Get next object
     * @return
     */
    @Override
    public ComputerProduct getNext() {
        ComputerProduct product = null;

        int nextItem = getPosition();

        if (hasNext()) {
            product = products.getAdvancedProduct(nextItem);
            setPosition(++nextItem);
        }

        return product;

    }

}
