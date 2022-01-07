package CreationalPattern.Singleton;

import java.io.File;

public class Client {

    public static void main(String[] args) {
        // delete existing event file if exists to get a fresh start
        File file = new File(System.getProperty("user.dir") + "/src/CreationalPattern/Singleton", "Events.txt");
        file.delete();

        // sell items
        Store store = new Store();
        for(int i = 0; i <= 5; i++) {
            store.sellItem();
        }
    }

}
