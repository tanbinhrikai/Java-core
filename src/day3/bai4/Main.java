package day3.bai4;

public class Main {
    static int binarySearch(int[] arr, int left, int right, int target, int[] count) {
        int mid = (left + right) / 2;
        if(left > right)
            return -1;
        count[0]++;
        if (arr[mid] == target)
            return mid;
        if (arr[mid] > target)
            return binarySearch(arr, left, mid - 1, target, count);
        else
            return binarySearch(arr, mid + 1, right, target, count);
    }

    static void main() {
        int[] nums = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int[] count = {0};
        int index = binarySearch(nums, 0, nums.length - 1, target, count);
        System.out.printf("Tim %d %n", target);
        System.out.printf("Tim thay tai index %d, sau %d lan so sanh %n", index, count[0]);

    }
}
