package bai3;

import java.util.Arrays;

public class Main {
    static void main() {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        int[] javaArray = numbers.clone();
        int  n = numbers.length;

        for(int i=0;i<n ; i++){
            boolean isChange = false;
            for(int j=0;j<n-1-i;j++){
                if(numbers[j]> numbers[j+1]){
                    int tam = numbers[j];
                    numbers[j]= numbers[j+1];
                    numbers[j+1]= tam;
                    isChange= true;
                }
            }

            System.out.println("pass "+ (i+1));
            for (int index=0;index<n;index++){
                System.out.print(" "+ numbers[index]);
            }
            System.out.println("");
            if(!isChange){
                break;
            }
        }

        Arrays.sort(javaArray);

        System.out.println(Arrays.toString(javaArray));




    }
}
