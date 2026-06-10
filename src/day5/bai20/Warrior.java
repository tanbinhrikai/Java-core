package day5.bai20;

public class Warrior extends Character{
    public Warrior(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }

    @Override
    void skill(Character obj) {
        int criticalDamage = this.attack - obj.defense;
        obj.setHp(obj.getHp() - criticalDamage);
        System.out.printf(
                "%s tan cong %s: -%d HP -> %s con %d HP %n",
                this.name,
                obj.getName(),
                criticalDamage,
                obj.name,
                obj.getHp());
    }
}
