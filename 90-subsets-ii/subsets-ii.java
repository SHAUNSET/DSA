import java.util.*;

class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums); 

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        solve(0, nums, current, result);

        return result;
    }

    void solve(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {

        result.add(new ArrayList<>(current)); 

        for (int i = index; i < nums.length; i++) {

            if (i > index && nums[i] == nums[i - 1]) continue;

            current.add(nums[i]);

            solve(i + 1, nums, current, result);

            current.remove(current.size() - 1);
        }
    }
}