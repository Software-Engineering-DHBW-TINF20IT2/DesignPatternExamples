package CreationalPattern.Prototype;

public class Fish implements Character {

    /**
     * Create a new fish
     * @return fish
     */
    @Override
    public Character clone() {
        return new Fish();
    }

    /**
     * Let the fish swim
     */
    @Override
    public void move(String name) {
        System.out.println("Fish " + name + " swims...");
    }
}
