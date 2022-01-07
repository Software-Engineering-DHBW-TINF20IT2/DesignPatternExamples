package BehaviouralPattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Email Service
 */
public class EmailService implements Service {

    private List<String> students = new ArrayList<>();
    final private String serviceName = "EMAIL";

    /**
     * Update via mail
     * @param message
     */
    @Override
    public void update(String message) {
        System.out.println("\nSend an email to all registered students");
        for(String mail : students) {
            System.out.println("-> sent to " + mail);
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
     * add contact mail of user to list
     * to notify it
     * @param student
     */
    @Override
    public void addUserContactData(Student student) {
        students.add(student.getMail());
    }
}
