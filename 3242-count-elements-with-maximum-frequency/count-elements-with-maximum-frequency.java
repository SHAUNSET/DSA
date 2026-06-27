class Solution {
    public int maxFrequencyElements(int[] nums) {


        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0;

        for(int num : map.keySet()) {

            if(map.get(num) > max){
                max = Math.max(max , map.get(num));
            }
        }

        int sum = 0;

        for(int num : map.keySet()){
            if(map.get(num)==max){
                sum = sum + map.get(num);
            }
        }

        return sum;
        
    }
}