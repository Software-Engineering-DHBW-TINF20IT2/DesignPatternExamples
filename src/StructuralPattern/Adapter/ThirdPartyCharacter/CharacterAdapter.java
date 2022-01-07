package StructuralPattern.Adapter.ThirdPartyCharacter;

import StructuralPattern.Adapter.Character.Character;

public class CharacterAdapter implements Character {

    private OnlineCharacter onlineCharacter;

    public CharacterAdapter(OnlineCharacter onlineCharacter) {
        this.onlineCharacter = onlineCharacter;
    }

    @Override
    public void attack() {
        onlineCharacter.doAttack();
    }

    @Override
    public void defend() {
        onlineCharacter.doDefend();
    }

    @Override
    public void move() {
        onlineCharacter.doMove();
    }
}
