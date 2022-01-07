package StructuralPattern.Adapter;

import StructuralPattern.Adapter.Character.ConcreteCharacter;
import StructuralPattern.Adapter.ThirdPartyCharacter.CharacterAdapter;
import StructuralPattern.Adapter.ThirdPartyCharacter.ConcreteOnlineCharacter;

public class Client {

    public static void main(String[] args) {
        // create a new game engine
        GameEngine engine = new GameEngine();

        // let your own character do some action
        System.out.println("Let your own character do some action");
        ConcreteCharacter human = new ConcreteCharacter();
        engine.triggerAction(human);

        // let a third party character do some action
        System.out.println("\nLet a 3rd party character do some action");
        ConcreteOnlineCharacter goomba = new ConcreteOnlineCharacter();
        CharacterAdapter adapter = new CharacterAdapter(goomba);
        engine.triggerAction(adapter);
    }

}
