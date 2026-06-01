package day3.bai10;

public class Main {
    static int giaiThua(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }

    static int giaiThuaRecursion(int n) {
        if (n == 1)
            return 1;
        return n * giaiThua(n - 1);
    }

    static int fibo(int n) {
        int f1 = 1;
        int f2 = 1;
        for (int i = 3; i <= n; i++) {
            int fi = f1 + f2;
            f1 = f2;
            f2 = fi;
        }

        return f2;
    }

    static int fiboRecursion(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    static void main() {
        long timeStart1 = System.nanoTime();
        System.out.println(giaiThua(10));
        System.out.println(System.nanoTime() - timeStart1);

        long timeStart2 = System.nanoTime();
        System.out.println(giaiThuaRecursion(10));
        System.out.println(System.nanoTime() - timeStart2);

        long timeStart3 = System.nanoTime();
        System.out.println(fibo(10));
        System.out.println(System.nanoTime() - timeStart3);

        long timeStart4 = System.nanoTime();
        System.out.println(fiboRecursion(10));
        System.out.println(System.nanoTime() - timeStart4);
    }
}
