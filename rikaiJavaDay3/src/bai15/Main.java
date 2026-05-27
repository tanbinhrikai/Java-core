package bai15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        int[] numbers = {1, 3, 2, 1, 4, 1, 3, 3};
        int n = numbers.length;
        int max = 0;

        for(int i=0;i<n;i++){
            boolean isCounted = false;
            for (int j =0;j<i;j++){
                if(numbers[i]==numbers[j]){
                    isCounted = true;
                }
            }
            if(isCounted){
                continue;
            }

            int count = 0;
            for(int j=0;j<n;j++){
                if(numbers[i]==numbers[j]){
                    count++;
                }
            }
            if(count>max){
                max=count;
            }

        }



        System.out.println("ptu nhieu nhat ");
        for(int i=0;i<n;i++){
            boolean isCounted = false;
            for(int j=0;j<i;j++){
                if(numbers[i]==numbers[j]){
                    isCounted = true;
                }
            }
            if(isCounted){
                continue;
            }
            int count = 0;
            for(int j=0;j<n;j++){
                if(numbers[i]==numbers[j]){
                    count++;
                }
            }

            if(count==max){
                System.out.println(numbers[i] + " xuaats hienj " + count + " lan");
            }

        }
    }
}
