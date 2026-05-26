package day2.bai15;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Nhap mot chuoi: ");
        String s = sc.nextLine();

        int countVowel = 0;
        int countConsonants = 0;
        int countSpace = 0;
        int countDigit = 0;
        int countSpecialChar = 0;

        for(char c : s.toCharArray()) {
            if("ueoaiUEOAI".indexOf(c) >= 0) {
                countVowel++;
            }
            else if(Character.isAlphabetic(c)) {
                countConsonants++;
            }

            if(Character.isDigit(c)) {
                countDigit++;
            }
            else if(Character.isSpaceChar(c)) {
                countSpace++;
            }
            else if (!Character.isAlphabetic(c)) {
                countSpecialChar++;
            }
        }

        System.out.printf("Nhap chuoi: %s %n", s);
        System.out.printf("Nguyen am: %d %n", countVowel);
        System.out.printf("Phu am: %d %n", countConsonants);
        System.out.printf("Khoang trang: %d %n", countSpace);
        System.out.printf("Chu so: %d %n", countDigit);
        System.out.printf("Ky tu dac biet: %d", countSpecialChar);
    }
}
