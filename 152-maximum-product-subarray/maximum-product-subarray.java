class Solution {
    public int maxProduct(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int prod = nums[i];
            int max = nums[i];  

            for (int j = i + 1; j < nums.length; j++) {

                prod *= nums[j];
                max = Math.max(max, prod);
            }

            result[i] = max;
        }

        int ans = result[0];

        for (int i = 1; i < result.length; i++) {
            ans = Math.max(ans, result[i]);
        }

        return ans;
    }
}