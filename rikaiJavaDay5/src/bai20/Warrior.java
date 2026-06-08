package bai20;

class Warrior extends Character {

    public Warrior(String name) {
        super(name, 100, 30, 10);
    }

    @Override
    public void skill(Character enemy) {
        System.out.println(name + " uses POWER SLASH!");
        enemy.takeDamage(attack + 15);
    }
}