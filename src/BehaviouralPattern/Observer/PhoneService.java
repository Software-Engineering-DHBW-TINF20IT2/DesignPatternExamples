package BehaviouralPattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Phone Service
 */
public class PhoneService implements Service {

    private List<String> students = new ArrayList<>();
    final private String serviceName = "PHONE";

    /**
     * Update via phone
     * @param message
     */
    @Override
    public void update(String message) {
        System.out.println("\nMake a call to all registered students");
        for(String number : students) {
            System.out.println("-> call " + number);
        }
    }

    /**
     * get name of registered service
     * @return
     */
    @Override
    public String getName() {
        return serviceName;
    }

    /**
     * add contact number of user to list
     * to notify it
     * @param student
     */
    @Override
    public void addUserContactData(Student student) {
        students.add(student.getPhoneNumber());
    }
}
