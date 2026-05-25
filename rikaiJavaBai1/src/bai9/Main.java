package bai9;

public class Main {

    public static void main() {


        int number = 42;

        Integer boxedInt = number;

        System.out.println("Autoboxing int:");
        System.out.println(number + " -> Integer(" + boxedInt + ")");
        System.out.println();

        double pi = 3.14;

        Double boxedDouble = pi;

        System.out.println("Autoboxing double:");
        System.out.println(pi + " -> Double(" + boxedDouble + ")");

        Integer score = 100;

        int unboxedScore = score;

        System.out.println("Unboxing Integer:");
        System.out.println("Integer(" + score + ") -> " + unboxedScore);

        Integer n = null;

        try {


            int x = n;

            System.out.println(x);

        } catch (NullPointerException e) {

            System.out.println("Khong an toan:");
            System.out.println("Integer n = null;");
            System.out.println("int x = n;");
            System.out.println("-> NullPointerException!");
        }

        System.out.println();

        
        Integer safeNumber = null;

        if (safeNumber != null) {

            int value = safeNumber;

            System.out.println("Gia tri = " + value);

        } else {

            System.out.println("An toan:");
            System.out.println("safeNumber == null");
            System.out.println("Khong thuc hien unboxing.");
        }
    }
}