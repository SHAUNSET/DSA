class Solution {
    public int countNumbersWithUniqueDigits(int n) {

        if(n == 0){
            return 1;
        }

        if(n==1){
            return 10;
        }

        int[] result = new int[n];

        result[0] = 10;

        int mul = 9;
        int available = 9;
        int k = 1 ;

        for(int i = 0 ; i < n-1 ; i++){
            mul = mul * available;
            available--;
            result[k] = mul;
            k++;
        }

        int sum = 0 ;

        for(int i = 0 ; i < n ; i++){
            sum = sum + result[i];
        }

        return sum;
        
    }
}