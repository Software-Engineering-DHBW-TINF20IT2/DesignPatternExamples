package CreationalPattern.Singleton;

public class Store {

    private int stock = 3;

    public void logEvent(String message) {
        // log event
        EventManager eventManager = EventManager.getInstance();
        eventManager.logEvent(getClass() + " says '" + message + "'");
    }

    public void sellItem() {
        // sell an item
        if(stock > 0) {
            stock--;
            logEvent("Item sold");
        } else {
            logEvent("No more items left");
            orderNewItems(3);
        }

    }

    public void orderNewItems(int number) {
        // order a new Item
        logEvent("Order " + number + " new Items");
        Production prod = new Production();
        prod.processOrder(number);
        stock = number;
        logEvent("Got " + number + " Items");
    }


}
