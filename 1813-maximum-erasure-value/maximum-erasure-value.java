class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0;
        int currentSum = 0;
        int maxSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];

            while (map.containsKey(num)) {
                map.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }

            map.put(num, 1);
            currentSum += num;


            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
