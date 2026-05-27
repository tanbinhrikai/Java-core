package day3.bai12;

public class Main {
    static boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int i = 0;
        int j = s.length() - 1;
        while(i != j) {
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }


    static void main() {
        String s = "racecar";
        String s2 = "A man a plan a canal Panama";
        String s3 = "hello";
        String s4 = "12321";

        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
        System.out.println(isPalindrome(s4));

    }
}
