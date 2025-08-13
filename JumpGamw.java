public class JumpGamw {
        public boolean canJump(int[] nums) {
            int n = nums.length;
            int[] dp = new int[n];
            dp[0] = 1;

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (dp[j] == 1 && j + nums[j] >= i) {
                        dp[i] = 1;
                        break;
                    }
                }
            }

            return dp[n - 1] == 1;
        }
    }

