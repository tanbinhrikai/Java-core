package day5.bai20;

public class Main {
    public static void main(String[] args) {
        Character warrior = new Warrior("Arthur (Warrior)", 120, 30, 15);
        Character wizard = new Wizard("Gandalf (Wizard)", 85, 10, 5);
        Character paladin = new Paladin("Uther (Paladin)", 110, 20, 12);

        Battle.simulate(warrior, wizard);
    }
}
