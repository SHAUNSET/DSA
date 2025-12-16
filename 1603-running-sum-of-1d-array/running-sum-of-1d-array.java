class Solution {
    public int[] runningSum(int[] nums) {

        int sum = 0 ;

        for(int i = 0; i < nums.length ; i++){
            int value = nums[i];
            sum = sum + value;
            nums[i] = sum;
        }

        return nums;
        
    }
}