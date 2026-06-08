package bai20;

class Wizard extends Character implements Mage {

    public Wizard(String name) {
        super(name, 80, 15, 5);
    }

    @Override
    public void skill(Character enemy) {
        castSpell(enemy, "Fireball");
    }

    @Override
    public void castSpell(Character target, String spell) {
        int damage = 40;
        System.out.println(name + " casts " + spell + "!");
        target.takeDamage(damage);
    }
}
