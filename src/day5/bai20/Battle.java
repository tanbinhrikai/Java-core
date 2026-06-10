package day5.bai20;

public class Battle {
    public static void simulate(Character c1, Character c2) {
        System.out.println("=== TRAN DANH ===");
        System.out.printf("%s(HP:%d) vs %s(HP:%d) %n", c1.getName(), c1.getHp(), c2.getName(), c2.getHp());
        System.out.println("------------------------");

        int turn = 1;
        while(c1.getHp() > 0 && c2.getHp() > 0) {
            c1.skill(c2);
            if(c2.hp <= 0) break;

            if(c1 instanceof Healer h && c1.getHp() < 20) {
                h.heal(c1);
            }

            c2.skill(c1);
            if (c1.getHp() <= 0) break;

            turn++;
        }

        System.out.println("\n========================");
        if (c1.getHp() > 0) {
            System.out.println("KET QUA: " + c1.getName() + " WIN");
        } else {
            System.out.println("KET QUA: " + c2.getName() + " WIN");
        }
        System.out.println("========================");
    }

}
