package BehaviouralPattern.Observer;

/**
 * Interface service that is implemented
 * by all types of services
 */
public interface Service {

    /**
     * update registered user with message
     * @param message
     */
    void update(String message);

    /**
     * get name of registered service
     * @return
     */
    String getName();

    /**
     * add users contact data
     * to contact list
     * @param student
     */
    void addUserContactData(Student student);

}
