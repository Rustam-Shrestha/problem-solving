import java.util.ArrayList;
import java.util.List;

public class ArrayPermutation {



    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(nums, new ArrayList<>(), result);
        return result;
    }
    public void dfs(int[] nums, List<Integer> perm, List<List<Integer>> result) {
        if (perm.size() == nums.length) {
            result.add(new ArrayList<>(perm));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (perm.contains(nums[i])) continue;
            perm.add(nums[i]);
            dfs(nums, perm, result);
            perm.remove(perm.size() - 1);
        }
    }
}
