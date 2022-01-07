package StructuralPattern.Composite;

public class Client {


    public static void main(String[] args) {
        // create menue level 1
        MenuEntry action1 = new Action("action1", 1);
        MenuEntry action2 = new Action("action2", 2);
        MenuEntry action3 = new ActionGroup("action3", 3);
        MenuEntry action4 = new Action("action4", 4);

        // create menue level2
        MenuEntry action5 = new Action("action5", 5);
        MenuEntry action6 = new Action("action6", 6);
        MenuEntry action7 = new Action("action7", 7);
        action3.add(action5);
        action3.add(action6);
        action3.add(action7);

        // show menue
        System.out.println("Default behaviour print single item:");
        action1.print(action1);
        System.out.println("\nPrint composite Item:");
        action3.print(action3);
    }
}
