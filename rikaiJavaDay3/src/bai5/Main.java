package bai5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        int[] numbers = {1, 3, 1, 5, 3, 7, 5, 9};
        List<Integer> check = new ArrayList<>();
        for(int i = 0;i< numbers.length;i++){
            if(check.indexOf(numbers[i])==-1){
                check.add(numbers[i]);
            }
        }
        System.out.println(check);
    }
}
