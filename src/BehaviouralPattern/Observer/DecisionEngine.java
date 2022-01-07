package BehaviouralPattern.Observer;

import java.util.HashMap;
import java.util.List;

/**
 * Service class to control message
 * system
 */
public class DecisionEngine {

    // Abstraction for all allowed types of
    // notification
    private ServiceNotifier serviceNotifier;

    /**
     * Create new service notifier
     */
    public DecisionEngine() {
        // create serviceNotifier
        serviceNotifier = new ServiceNotifier();
    }

    /**
     * Attach new type of service to service notifier
     * @param service
     */
    public void registerService(Service service) {
        serviceNotifier.attach(service);
    }

    /**
     * Register new user to engine
     * @param student
     */
    public void registerUser(Student student) {
        boolean success = serviceNotifier.registerUser(student);
        if(!success){
            throw new UnsupportedOperationException("Communication channel not supported");
        };
    }


    /**
     * Send message to all registered users
     * with all services of service notifier
     * @param message
     */
    public void sendMessage(String message) {
        System.out.println("Send message '" + message + "' to registered users: ");
        serviceNotifier.notify(message);
    }

}
