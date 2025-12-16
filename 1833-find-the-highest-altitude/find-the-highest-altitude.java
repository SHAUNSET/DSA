class Solution {
    public int largestAltitude(int[] gain) {

        int highgain = 0 ;
        int sum = 0;

        for(int i = 0 ; i < gain.length ; i++){
            sum = sum + gain[i];
            highgain = Math.max(sum , highgain);
        }

        return highgain;
        
    }
}