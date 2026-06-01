package day3.bai17;

import java.util.Arrays;

public class Main {
    static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return  true;
    }

    static void eratosthenes(int n) {
        boolean[] sieve = new boolean[n + 1];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;
        sieve[2] = true;

        for (int i = 2; i <= n; i++) {
            for (int j = i * 2; j <= n; j = j + i) {
                sieve[j] = false;
            }

            if(sieve[i]) {
                System.out.printf("%d ", i);
            }
        }
    }

    static void bruteForce(int n) {
        for(int i = 2; i <= n; i++) {
            if(isPrime(i)) {
                System.out.printf("%d ", i);
            }
        }
    }

    static void main() {
        int n = 50;
        long startTime1 = System.nanoTime();
        eratosthenes(n);
        System.out.println("");
        System.out.println(System.nanoTime() - startTime1);

        long startTime2 = System.nanoTime();
        bruteForce(n);
        System.out.println("");
        System.out.println(System.nanoTime() - startTime2);

    }
}
