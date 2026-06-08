package bai20;

class Priest extends Character implements Healer {

    public Priest(String name) {
        super(name, 80, 10, 5);
    }

    @Override
    public void skill(Character enemy) {
        System.out.println(name + " uses holy strike!");
        enemy.takeDamage(attack);
    }

    @Override
    public void heal(Character target) {
        int amount = 25;
        target.hp += amount;
        System.out.println(name + " heals " + target.name + " + " + amount + " HP");
    }
}

