class Solution {
    public int sumOfUnique(int[] nums) {

        HashMap<Integer , Integer> map = new HashMap<>();
        int[] result = new int[nums.length];

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num , map.get(num)+1);
            }
            else{
                map.put(num ,1);
            }
        }

        int i = 0;

        for(int num : map.keySet()){
            if(map.get(num)==1){
                result[i] = num;
                i++;
            }
        }

        int sum = 0;

        for(int j = 0 ; j < result.length ; j++){
            sum = sum + result[j];
        }

        return sum;

    }
}