package day3.bai18;

public class Main {
    static int sum(int... nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    static double sum(double... nums) {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    static double average(double... nums) {
        return sum(nums) / (double) nums.length;
    }

    static int max(int... nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    static int min(int... nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    static int range(int... nums) {
        return max(nums) - min(nums);
    }

    static void main() {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(average(2.5, 3.5, 4.0));
        System.out.println(max(7, 2, 9, 1));
    }
}
