package StructuralPattern.Adapter.ThirdPartyCharacter;

public class ConcreteOnlineCharacter implements OnlineCharacter {

    @Override
    public void doMove() {
        System.out.println("Walk like a mushroom...");
    }

    @Override
    public void doAttack() {
        System.out.println("Walk into a main character...");
    }

    @Override
    public void doDefend() {
        System.out.println("Walk away from main character...");
    }
}
