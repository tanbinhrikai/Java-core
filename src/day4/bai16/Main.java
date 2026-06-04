package day4.bai16;

public class Main {
    static void main() {
//        Time t = new Time(23,58, 30);
//        t.addSeconds(200);
//        System.out.printf("%d %n", t.toSeconds());
//        System.out.println(new Time(10,30,0).isBefore(new Time(11,0,0)));
//        System.out.println(t);

//        Time t = new Time(5, 9, 2);
//        Time t = new Time(23, 58, 30);
//        t.addSeconds(200);
//        System.out.println(t);

        Time t_edge2 = new Time(1, 0, 0);
        t_edge2.addSeconds(-10);
        System.out.println("01:00:00 cong (-10) giay: " + t_edge2.toString() + " | Ky vong: 00:59:50");
        t_edge2.addHours(-2);
        System.out.println("Sau do cong (-2) gio: " + t_edge2.toString() + " | Ky vong: 22:59:50\n");

        System.out.println("--- KET THUC KIEM TRA ---");
    }
}
