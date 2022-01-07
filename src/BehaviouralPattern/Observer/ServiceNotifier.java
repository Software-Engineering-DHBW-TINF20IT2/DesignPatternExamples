package BehaviouralPattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class for subjects
 */
public class ServiceNotifier {

    // list of all services of notifier
    private List<Service> serviceList = new ArrayList<Service>();

    /**
     * All allowed service types
     */
    enum allowedService {
        PHONE,
        SMS,
        EMAIL
    }

    /**
     * Register new user to specific service list
     * @param student
     */
    public boolean registerUser(Student student) {
        try {
            allowedService serviceType = allowedService.valueOf(student.getCommunicationChannel().toUpperCase());
            for (Service service : serviceList) {
                if (service.getName().toUpperCase().equals(serviceType.toString().toUpperCase())) {
                    service.addUserContactData(student);
                    return true;
                }
            }
        } catch (NullPointerException | IllegalArgumentException ex) {
            ex.printStackTrace();
        }

        return false;
    }

    /**
     * Add new service to list
     * @param service
     */
    public void attach(Service service) {
        this.serviceList.add(service);
    }

    /**
     * Notify each service in list
     * @param message
     */
    public void notify(String message) {
        for(Service service : serviceList) {
            service.update(message);
        }
    }

    // Getter / Setter
    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }
}
