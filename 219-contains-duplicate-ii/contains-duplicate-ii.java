class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            int rightNum = nums[right];
            if (map.containsKey(rightNum)) {
                if (right - map.get(rightNum) <= k) {
                    return true;
                }
            }

            map.put(rightNum, right);
        }

        return false; 
    }
}
