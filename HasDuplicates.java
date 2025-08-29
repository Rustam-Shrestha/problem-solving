
import java.util.Set;
import java.util.HashSet;

public class HasDuplicates {
    public static boolean hasDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] inputNums = {1, 2, 3, 4, 5};
        hasDuplicates(inputNums);
    }
}

// time and space complexity is both O(n)
