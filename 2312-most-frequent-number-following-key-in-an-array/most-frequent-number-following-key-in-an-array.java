class Solution {
    public int mostFrequent(int[] nums, int key) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int maxFreq = 0;
        int result = 0;
        
        for(int i = 0; i < nums.length - 1; i++) {
            
            if(nums[i] == key) {
                
                int next = nums[i + 1];
                
                map.put(next, map.getOrDefault(next, 0) + 1);
                
                if(map.get(next) > maxFreq) {
                    maxFreq = map.get(next);
                    result = next;
                }
            }
        }
        
        return result;
    }
}
