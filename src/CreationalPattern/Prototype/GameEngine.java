package CreationalPattern.Prototype;

import java.util.Random;

public class GameEngine {

    /**
     * Clone a random number of characters
     * @param character in the scene
     */
    public static void add(Character character) {
        // Obtain a number between [0 - 4]
        Random rand = new Random();
        int number = rand.nextInt(5);
        // Clone character
        for(int i=0; i <= number; i++) {
            Character newCharacter = character.clone();
            newCharacter.move(character.getClass().toString() + (i+1));
        }
    }

    /**
     * Create the game scene
     * @param args
     */
    public static void main(String[] args) {
        // create random numbers of humans
        Character human = new Human();
        add(human);

        // create random number of fishes
        Character fish = new Fish();
        add(fish);

        // create random number of birds
        Character bird = new Bird();
        add(bird);
    }
}
