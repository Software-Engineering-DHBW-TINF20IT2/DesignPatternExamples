package CreationalPattern.Prototype;

public class Bird implements Character {

    /**
     * Create a new bird
     * @return bird
     */
    @Override
    public Character clone() {
        return new Bird();
    }

    /**
     * Let the bird fly
     */
    @Override
    public void move(String name) {
        System.out.println("Bird " + name + " flys...");
    }
}
