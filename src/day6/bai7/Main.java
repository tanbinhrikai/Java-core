package day6.bai7;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] ars) {
        PriorityQueue<BenhNhan> queue = new PriorityQueue<>(Comparator.comparingInt(BenhNhan::getMucDoCapCuu));
        BenhNhan bn1 = new BenhNhan("An", 5);
        BenhNhan bn2 = new BenhNhan("Bao", 3);
        BenhNhan bn3 = new BenhNhan("Chi", 1);
        BenhNhan bn4 = new BenhNhan("Dao", 4);
        BenhNhan bn5 = new BenhNhan("Em", 2);

        queue.add(bn1);
        queue.add(bn2);
        queue.add(bn3);
        queue.add(bn4);
        queue.add(bn5);

        queue.forEach(q -> {
            System.out.println(q);
        });

        System.out.println("===========");

        BenhNhan bn6 = new BenhNhan("New", 1);
        queue.add(bn6);

        System.out.println(queue.poll());
        System.out.println(queue.poll());



    }
}
