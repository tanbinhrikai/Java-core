package bai12;

public class Main {
    public void main(){

        double d = 3.99;
        int f = (int) d;

        System.out.println("double d = 3.99");
        System.out.println("(int)d = " + f);
        System.out.println();


        long bigNumber = 10000000000L;
        int overflowValue = (int) bigNumber;

        System.out.println("long bigNumber = 10_000_000_000L");
        System.out.println("(int)bigNumber = " + overflowValue);


        String numberString = "123";

        int parsedNumber = Integer.parseInt(numberString);

        System.out.println("String numberString = \"123\"");
        System.out.println("Integer.parseInt(numberString) = " + parsedNumber);
        System.out.println();

        String invalidString = "abc";

        try {
            int invalidParse = Integer.parseInt(invalidString);

            System.out.println(invalidParse);

        } catch (NumberFormatException e) {

            System.out.println("String invalidString = \"abc\"");
            System.out.println("Integer.parseInt(\"abc\") -> NumberFormatException");
            System.out.println("Lỗi: Chuỗi không phải số hợp lệ!");
        }
    }

}
