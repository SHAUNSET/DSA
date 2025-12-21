class Solution {
    public int hammingDistance(int x, int y) {

        int count = 0;

        while(x > 0 || y > 0){
            int xin = x % 2;
            int yin = y % 2;

            x = x / 2;
            y = y / 2;

            if(xin != yin){
                count++;
            }
        }

        return count;
        
    }
}