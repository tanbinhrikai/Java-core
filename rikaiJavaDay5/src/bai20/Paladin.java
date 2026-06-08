package bai20;

class Paladin extends Character implements Healer, Mage {

    public Paladin(String name) {
        super(name, 120, 20, 15);
    }

    @Override
    public void skill(Character enemy) {
        System.out.println(name + " uses HOLY STRIKE!");
        enemy.takeDamage(attack + 10);
    }

    @Override
    public void heal(Character target) {
        int amount = 20;
        target.hp += amount;
        System.out.println(name + " heals " + target.name + " + " + amount);
    }

    @Override
    public void castSpell(Character target, String spell) {
        System.out.println(name + " casts " + spell);
        target.takeDamage(30);
    }
}

