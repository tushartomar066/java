package DSA.classwork;

public class rightSumEqualToLeftSum {
    public static int catch1(
            int[] nums) {
        if (nums == null || nums.length == 0) return -1;

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int prefix = 0, suffix = 0;
        for (int i = 0; i < nums.length; i++) {
            suffix = sum - prefix;
            prefix += nums[i];
            if (prefix == suffix) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1, 7, 3, 6, 5, 6};

        System.out.println(catch1(nums));

    }
}
