package CreationalPattern.Prototype;

public class Human implements Character {

    /**
     * Create a new human
     * @return human
     */
    @Override
    public Character clone() {
        return new Human();
    }

    /**
     * Let the human walk
     */
    @Override
    public void move(String name) {
        System.out.println("Human " + name + " walks...");
    }
}
