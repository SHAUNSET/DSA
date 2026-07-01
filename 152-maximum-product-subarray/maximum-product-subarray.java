class Solution {
    public int maxProduct(int[] nums) {


        int maxEnding = nums[0];
        int minEnding = nums[0];

        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int current = nums[i];

            int prevMax = maxEnding;
            int prevMin = minEnding;


            maxEnding = Math.max(
                    current,
                    Math.max(prevMax * current, prevMin * current)
            );


            minEnding = Math.min(
                    current,
                    Math.min(prevMax * current, prevMin * current)
            );

            ans = Math.max(ans, maxEnding);
        }

        return ans;
    }
}