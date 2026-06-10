package day5.bai20;

public class Wizard extends Character implements Mage{
    public Wizard(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }

    @Override
    public void castSpell(Character target, String spell) {
        System.out.println("[" + name + " thi triển ma pháp: " + spell + "]");
        int magicDamage = 50;
        target.setHp(target.getHp() - magicDamage);
        System.out.println("-> Phép thuật nổ tung! " + target.getName() + " bị trừ " + magicDamage + " HP, còn lại: " + target.getHp() + " HP");
    }

    @Override
    void skill(Character obj) {
        castSpell(obj, "Phép thuật wind remix");
    }
}
