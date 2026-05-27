package day2.bai19;

import java.time.LocalDate;

public class MAIN {
    static boolean isLeafYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }


    static void main() {
        int month = 4;
        int year = 2026;

        int day = LocalDate.of(year, month, 1).getDayOfWeek().getValue();

        System.out.println(day);


        System.out.printf("Thang %d/%d %n", month, year);
        System.out.print("T2\tT3\tT4\tT5\tT6\tT7\tCN");
        System.out.println("");
        int count = day - 1;

        int daysOfMonth = switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                if(isLeafYear(year)) {
                    yield 29;
                }
                else  {

                    yield 28;
                }
            }
            default -> 31;
        };

        for (int i = 1; i < day; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= daysOfMonth; i++) {
            if (count == 7) {
                System.out.println("");
                count = 0;
            }
            System.out.printf("%d\t", i);
            count++;
        }
    }
}
