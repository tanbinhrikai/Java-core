package day3.bai15;

import java.util.Arrays;

public class Main {
    static void main() {

        int[] arr = {1, 3, 2, 1, 4, 1, 3, 3};
        boolean[] visited = new boolean[arr.length];
        int countMostFrequently = 0;
        for(int i = 0; i < arr.length; i++) {
            if(visited[i])
                continue;

            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            if(count > countMostFrequently) countMostFrequently = count;
        }

        Arrays.fill(visited, false);

        String phanTuMax = "";
        for(int i = 0; i < arr.length; i++) {
            if(visited[i])
                continue;
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.printf("Phan tu %d: xuat hien %d lan %n", arr[i], count);

            if(count == countMostFrequently && !phanTuMax.contains(String.valueOf(arr[i])))
                phanTuMax = phanTuMax + arr[i] + " và ";
        }
        phanTuMax = phanTuMax.substring(0,phanTuMax.length() - 4);

        System.out.printf("Phan tu nhieu nhat: %s (moi cai %d lan)", phanTuMax, countMostFrequently);

    }
}
