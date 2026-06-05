package day5.bai8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Payment> payments = new ArrayList<>();
        payments.add(new CreditCard());
        payments.add(new MoMo());
        payments.add(new Cash());


        for (Payment p : payments) {
            p.process();
            if (p instanceof CreditCard cc) {
                cc.applyDiscount();
            } else if (p instanceof MoMo mm) {
                mm.sendCashback();
            } else if (p instanceof Cash cash) {
                cash.inBienNhan();
            }
        }
    }
}
