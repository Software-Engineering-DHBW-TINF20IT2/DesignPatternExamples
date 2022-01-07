package StructuralPattern.Adapter;

import StructuralPattern.Adapter.Character.Character;

public class GameEngine {

    /**
     * trigger some action
     * @param character
     */
    public void triggerAction(Character character) {
        // make character move
        character.move();

        // defend if being attacked and stops moving
        character.defend();

        // attack if stopped defending
        character.attack();
    }



}
