package day5.bai20;

public class Paladin extends Character implements Healer, Mage{
    public Paladin(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }

    @Override
    public void heal(Character target) {

    }

    @Override
    public void castSpell(Character target,String spell) {

    }

    @Override
    void skill(Character obj) {

    }
}
