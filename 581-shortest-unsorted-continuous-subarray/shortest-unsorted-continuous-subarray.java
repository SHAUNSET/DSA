import java.util.*;

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int[] sorted = nums.clone();  
        Arrays.sort(sorted);

        int start = 0, end = nums.length - 1;

  
        while (start < nums.length && nums[start] == sorted[start]) {
            start++;
        }


        if (start == nums.length) return 0;


        while (end >= 0 && nums[end] == sorted[end]) {
            end--;
        }

        return end - start + 1;
    }
}