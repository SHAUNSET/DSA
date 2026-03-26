import java.util.*;

class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums); 

        Set<List<Integer>> set = new HashSet<>();
        List<Integer> current = new ArrayList<>();

        solve(0, nums, current, set);

        return new ArrayList<>(set); 
    }

    void solve(int index, int[] nums, List<Integer> current, Set<List<Integer>> set) {

        if (index == nums.length) {
            set.add(new ArrayList<>(current)); 
            return;
        }

        current.add(nums[index]);
        solve(index + 1, nums, current, set);

        current.remove(current.size() - 1);

        solve(index + 1, nums, current, set);
    }
}