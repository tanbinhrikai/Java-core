package day4.bai17;

import day4.bai13.SinhVien;

public class Main {
    static void main() {
        MyStack<Integer> myStackInte = new MyStack<>();
        MyStack<String> myStackStr = new MyStack<>();
        myStackStr.push("Anh");
        myStackStr.push("Em");
        myStackStr.push("CHau");
        MyStack<SinhVien> sinhVienMyStack = new MyStack<>();
        sinhVienMyStack.push(new SinhVien("duy", 9.2));
        sinhVienMyStack.push(new SinhVien("bao", 9.5));
        sinhVienMyStack.push(new SinhVien("cong", 7.1));
        System.out.println(sinhVienMyStack.pop());
        System.out.println(sinhVienMyStack.pop());
        System.out.println("size: = " + sinhVienMyStack.size());

        System.out.println(myStackStr.peek());

        MyStack test = new MyStack();
        test.push(5);
        test.push("TOi la ai");
        try {
            Integer i = (Integer) test.pop();
        } catch (ClassCastException e) {
            System.err.println(e.getMessage());
        }

        myStackInte.push(5);
        myStackInte.push(1);
        myStackInte.push(2);

        myStackInte.print();

        System.out.println("size " + myStackInte.size());
        System.out.println("Peak " + myStackInte.peek());
        System.out.println("Pop: " + myStackInte.pop() + " size = " + myStackInte.size());
        myStackInte.pop();
        myStackInte.pop();
        myStackInte.pop();

        System.out.println("isEmpty: " + myStackInte.isEmpty());
    }
}
