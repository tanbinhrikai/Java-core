package day3.bai5;

public class Main {
    static void main() {
        int[] nums = {1, 3, 1, 5, 3, 9, 9, 9};
        int size = nums.length;

        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if(nums[i] == nums[j]) {
                    for(int n = j; n < size -1 ; n++) {
                        nums[n] = nums[n + 1];
                    }
                    size--;
                    j--;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.printf("%d ", nums[i]);
        }
    }
}
