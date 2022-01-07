package StructuralPattern.Adapter.Character;

public class ConcreteCharacter implements Character {

    @Override
    public void attack() {
        System.out.println("Normal Character attacks...");
    }

    @Override
    public void defend() {
        System.out.println("Normal Character defends...");
    }

    @Override
    public void move() {
        System.out.println("Normal Character walks...");
    }
}
