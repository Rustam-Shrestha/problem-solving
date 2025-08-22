
public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int num : nums) total += num;

        // If total is odd, can't split equally
        if (total % 2 != 0) return false;

        int target = total / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // base case

        // Nested for-loop DP
        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }

        return dp[target];
    }

    public static void main(String[] args) {
        PartitionEqualSubsetSum solver = new PartitionEqualSubsetSum();
        int[] nums = {1, 5, 11, 5};
        System.out.println("Can partition: " + solver.canPartition(nums)); // true
    }
}
