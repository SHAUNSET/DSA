class Solution {
    public int totalFruit(int[] fruits) {

        int left = 0 ;
        HashMap<Integer , Integer> map = new HashMap<>();
        int maxlength = 0;

        for(int right = 0 ; right < fruits.length ; right++){

            int rightFruit = fruits[right];

            if(map.containsKey(fruits[right])){
                map.put(rightFruit , map.get(rightFruit) + 1);
            }
            else{
                map.put(rightFruit , 1);
            }

            while(map.size() > 2){
                int leftFruit = fruits[left];
                 map.put(leftFruit, map.get(leftFruit) - 1);

                 if (map.get(leftFruit) == 0) {
                     map.remove(leftFruit);
                    }
                    
                left++;
            }
            maxlength = Math.max(maxlength , right - left + 1);
        }

        return maxlength;         
        
    }
}