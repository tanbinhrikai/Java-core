package bai18;

public class Main {

    public static void main(String[] args) {

    }

    static int sum(int... nums) {
        int total = 0;

        for (int x : nums) {
            total += x;
        }

        return total;
    }

    static double average(int... nums) {

        if (nums.length == 0) return 0;

        int total = 0;

        for (int x : nums) {
            total += x;
        }

        return (double) total / nums.length;
    }

    static int range(int... nums) {

        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > max) {
                max = nums[i];
            }

            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return max - min;
    }
}