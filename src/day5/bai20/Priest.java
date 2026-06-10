package day5.bai20;

public class Priest extends Character implements Healer{
    public Priest(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }

    @Override
    public void heal(Character target) {

    }

    @Override
    void skill(Character target) {

    }
}
