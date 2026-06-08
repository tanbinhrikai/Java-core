package bai16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[n];
        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student " + (i + 1) + " (name score):");

            String[] parts = scanner.nextLine().split(",");

            names[i] = parts[0].trim();
            scores[i] = Double.parseDouble(parts[1].trim());
        }

        bubbleSort(names, scores);

        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " (" + scores[i] + ")");
        }

        scanner.close();
    }

    static void bubbleSort(String[] names, double[] scores) {

        int n = names.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (scores[j] < scores[j + 1] ||
                        (scores[j] == scores[j + 1] &&
                                names[j].compareTo(names[j + 1]) < 0)) {

                    swap(names, scores, j, j + 1);
                }
            }
        }
    }

    static void swap(String[] names, double[] scores, int i, int j) {

        String tempName = names[i];
        names[i] = names[j];
        names[j] = tempName;

        double tempScore = scores[i];
        scores[i] = scores[j];
        scores[j] = tempScore;
    }
}