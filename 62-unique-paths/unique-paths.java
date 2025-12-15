class Solution {
    public int uniquePaths(int m, int n) {

        int total = m + n - 2;
        int down = m - 1;
        int right = n - 1;

        int best = Math.min(down, right);

        long result = 1;

        for(int i = 1 ; i <= best ; i++){
            result = result * (total-best+i)/i;
        }

        return (int) result;

        
    }
}