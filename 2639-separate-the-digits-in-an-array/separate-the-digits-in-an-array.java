class Solution {
    public int[] separateDigits(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int num : nums){

            ArrayList<Integer> temp = new ArrayList<>();

            while(num > 0){

                int digit = num % 10;
                temp.add(digit);

                num = num / 10;
            }

            for(int i = temp.size() - 1 ; i >= 0 ; i--){
                list.add(temp.get(i));
            }
        }

        int[] ans = new int[list.size()];

        for(int i = 0 ; i < list.size() ; i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}