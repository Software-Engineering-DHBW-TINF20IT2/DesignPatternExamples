package CreationalPattern.Singleton;

public class Production {

    public void logEvent(String message) {
        // log event
        EventManager eventManager = EventManager.getInstance();
        eventManager.logEvent(getClass() + " says '" + message + "'");
    }

    public void createItem() {
        // sell an item
        logEvent("Item created");
    }

    public void deliverToStore() {
        logEvent("Deliver Items to store");
    }

    public void processOrder(int number) {
        logEvent("Got order to create " + number + " new items");
        for(int i = 0; i < number; i++) {
            createItem();
        }
        logEvent("Order processed");
        deliverToStore();
    }

}
