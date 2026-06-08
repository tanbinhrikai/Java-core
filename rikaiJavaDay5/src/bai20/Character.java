package bai20;

abstract class Character {
    String name;
    int hp;
    int attack;
    int defense;

    public Character(String name, int hp, int attack, int defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void takeDamage(int dmg) {
        int realDmg = Math.max(0, dmg - defense);
        hp -= realDmg;
        System.out.println(name + " takes " + realDmg + " damage -> HP: " + hp);
    }

    public void basicAttack(Character target) {
        System.out.println(name + " attacks " + target.name);
        target.takeDamage(attack);
    }

    public abstract void skill(Character enemy);
}

