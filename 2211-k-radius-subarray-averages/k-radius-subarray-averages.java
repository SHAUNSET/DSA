class Solution {
    public int[] getAverages(int[] nums, int k) {
        
        int n = nums.length;
        int result[] = new int[n];

        if(2*k + 1 > n){
            Arrays.fill(result, -1);
            return result;
        }

        for(int i = 0; i < k; i++){
            result[i] = -1;
        }

        long sum = 0;

        for(int i = 0; i <= 2*k; i++){
            sum += nums[i];
        }


        result[k] = (int)(sum / (2*k + 1));

        for(int i = k+1; i < n-k; i++){

            sum -= nums[i - k - 1];
            sum += nums[i + k];

            result[i] = (int)(sum / (2*k + 1));
        }


        for(int i = n - k; i < n; i++){
            result[i] = -1;
        }

        return result;
    }
}
