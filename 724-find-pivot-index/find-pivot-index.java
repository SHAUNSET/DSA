class Solution {
    public int pivotIndex(int[] nums) {

        int totalSum = 0;

        for(int i = 0 ; i < nums.length ; i++){
            totalSum = totalSum + nums[i];
        }

        int leftsum = 0;

        for(int i = 0 ; i <nums.length ; i++){
            if(leftsum == totalSum - leftsum - nums[i]){
                return i;
            }
            leftsum = leftsum + nums[i];
        }
        return -1;
        
    }
}