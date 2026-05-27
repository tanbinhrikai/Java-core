package day3.bai3;

public class Main {
    static void main() {
        int[] nums = {64, 34, 25, 12, 22, 88, 90};
        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }
            System.out.printf("Pass %d: ", i + 1);
            for (int x : nums) {
                System.out.printf("%d ", x);
            }
            System.out.println("");
            if (!swapped) break;
        }
    }
}
