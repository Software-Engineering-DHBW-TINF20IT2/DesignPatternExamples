package CreationalPattern.Prototype;

public interface Character {

    /**
     * Create a copy of a character
     * @return type of character
     */
    Character clone();

    /**
     * Let the character move
     */
    void move(String name);

}
