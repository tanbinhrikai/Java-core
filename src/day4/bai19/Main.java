package day4.bai19;

public class Main {
    static void main() {
        CCL<Integer> ccl = new CCL<>();
        ccl.addLast(1);
        ccl.addLast(2);
        ccl.addLast(3);
        ccl.addLast(4);
        ccl.addLast(5);

//        ccl.addLast(6);
//        ccl.remove(3);

        ccl.rotate(2);
        ccl.print();

        System.out.println(ccl.contains(2));

    }
}
