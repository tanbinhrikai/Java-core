package day1.bai12;

public class Main {
    static void main() {
        //Narrowing KHÔNG làm tròn
        double d = 3.99;
        int i = (int) d;
        System.out.println(i);

//        long l = 9999999999999;
//        int i1 = (int) l;

        String str = "aaaa";
        try {
            Integer num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
    }
}
