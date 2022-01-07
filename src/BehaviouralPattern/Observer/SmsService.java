package BehaviouralPattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete SMS Service
 */
public class SmsService implements Service {

    private List<String> students = new ArrayList<>();
    final private String serviceName = "SMS";

    /**
     * Update via sms
     * @param message
     */
    @Override
    public void update(String message) {
        System.out.println("\nWrite a sms to all registered students");
        for(String number : students) {
            System.out.println("-> sent to " + number);
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
