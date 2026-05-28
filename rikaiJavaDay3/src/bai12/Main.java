package bai12;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi can check ");
        String input = scanner.nextLine();

        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        int rigth = input.length() -1;
        int left =0;
        boolean isPalindrome = true;
        while (left<rigth){
            if(input.charAt(left)!=input.charAt(rigth)){
                isPalindrome = false;
                break;
            }
            left++;
            rigth--;

        }
        if(isPalindrome){
            System.out.println("la palindrome");
        }else {
            System.out.println("khong phai palindrome");
        }
    }
}
