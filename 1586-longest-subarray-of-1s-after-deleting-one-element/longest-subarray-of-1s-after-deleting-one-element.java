class Solution {
    public int longestSubarray(int[] nums) {
        
        int left = 0 ; 
        int maxzero = 0 ; 
        int maxlen = 0 ;

        for(int right = 0 ; right < nums.length ; right++){

            if(nums[right] == 0){
                maxzero++;
            }

            while(maxzero>1){
                if(nums[left] == 0){
                    maxzero--;
                }
                left++;
            }

            maxlen = Math.max(maxlen , right - left);


        }

        return maxlen;
    }
}