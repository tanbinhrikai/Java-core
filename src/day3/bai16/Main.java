package day3.bai16;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void swap(double[] arr, int i, int j) {
        double a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }

    static void main() {
        String[] names = {"AN", "BAO", "CHI", "DAO"};
        double[] scores = {9, 8.5, 9.0, 8.5};

        for (int i = 0; i < scores.length; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (Double.compare(scores[i], scores[j]) < 0) {
                    swap(scores, i, j);
                    swap(names, i, j);
                }
            }
        }
        System.out.println("Diem giam dan");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("(%s,%.2f) \t", names[i], scores[i]);
        }


        System.out.println("");
        System.out.println("THeo diem + ten");
        for (int i = 0; i < scores.length; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (Math.abs(scores[i] - scores[j]) < 0.0001) {
                    if (names[i].length() == names[j].length()) {
                        if (names[i].charAt(0) > names[j].charAt(0)) {
                            swap(names, i, j);
                        }
                    } else if (names[i].charAt(0) > names[j].charAt(0)) {
                        swap(names, i, j);
                    }
                }
                else if (Double.compare(scores[i], scores[j]) < 0) {
                    swap(scores, i, j);
                    swap(names, i, j);
                }
            }
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("(%s,%.2f) \t", names[i], scores[i]);
        }





    }
}
