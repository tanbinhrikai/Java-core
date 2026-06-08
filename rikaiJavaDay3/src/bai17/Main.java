package bai17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        boolean[] isComposite = new boolean[n + 1];

        for (int i = 2; i * i <= n; i++) {

            if (!isComposite[i]) {

                for (int j = i * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        System.out.println("Primes:");

        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}