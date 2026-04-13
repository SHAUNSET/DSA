class Solution {
    public int getMinDistance(int[] nums, int target, int start) {

        int dist = Integer.MAX_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                int num = Math.abs(i - start);
                dist = Math.min(dist, num);
            }
        }

        return dist;
    }
}