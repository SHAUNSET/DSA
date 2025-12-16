class Solution {
    public int findNumbers(int[] nums) {

        int evenCount = 0 ;

        for(int num : nums){
            int rev = 0 ;
            int digit = 0;
            int count = 0 ;
            while(num>0){
                digit = num%10;
                rev = rev*10 + digit;
                num = num / 10;
                count++;
            }

            if(count%2==0){
                evenCount++;
            }
            else{
                continue;
            }
        }

        return evenCount;
        
    }
}