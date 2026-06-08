package bai20;

class Battle {

    public void simulate(Character c1, Character c2) {

        System.out.println(c1.name + " vs " + c2.name);

        boolean turn = true;

        while (c1.isAlive() && c2.isAlive()) {

            if (turn) {
                action(c1, c2);
            } else {
                action(c2, c1);
            }

            turn = !turn;
        }


        if (c1.isAlive()) {
            System.out.println(c1.name + " WINS!");
        } else {
            System.out.println(c2.name + " WINS!");
        }
    }

    private void action(Character attacker, Character defender) {

        if (Math.random() < 0.7) {
            attacker.skill(defender);
        } else {
            attacker.basicAttack(defender);
        }

        if (attacker instanceof Mage mage && Math.random() < 0.3) {
            mage.castSpell(defender, "Extra Fire");
        }

        if (attacker instanceof Healer healer && Math.random() < 0.3) {
            healer.heal(attacker);
        }
    }
}

