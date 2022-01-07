package StructuralPattern.Facade.Subsystems;

import StructuralPattern.Facade.Message;

/**
 * Handle incoming messages from earth
 * Execute actions at sensor system
 */
public class SystemManager {

    public Message getNextMessage() {
        // read next message from MOM...
        // create a mock here
        return new Message("Message text", 1);
    }

    public void handleMessage() {
        // create serial communication

        // create wireless communication

        // ...

    }

}
