package bai20;

public class Main {
    public static void main(String[] args) {

        Character warrior = new Warrior("Warrior");
        Character wizard = new Wizard("Wizard");

        Battle battle = new Battle();
        battle.simulate(warrior, wizard);
    }
}
