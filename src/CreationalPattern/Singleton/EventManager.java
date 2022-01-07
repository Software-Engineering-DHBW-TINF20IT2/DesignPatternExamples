package CreationalPattern.Singleton;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EventManager {

    // single instance of event manager
    private static final EventManager eventManager = new EventManager();
    private final File eventStream = new File(System.getProperty("user.dir") + "/src/CreationalPattern/Singleton", "Events.txt");

    /**
     * Return singleton instance of event manager
     * @return eventManager
     */
    public static EventManager getInstance() {
        return eventManager;
    }

    /**
     * log event
     * @param eventDescription log description
     */
    public void logEvent(String eventDescription) {
        System.out.println("Event: " + eventDescription);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(this.eventStream, true));
            writer.write("\n" + eventDescription);
            writer.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
