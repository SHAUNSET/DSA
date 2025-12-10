class Solution {
    public int reverse(int x) {

        int number = 0;

        while (x != 0) {
            int digit = x % 10;

            if (number > Integer.MAX_VALUE/10 || number < Integer.MIN_VALUE/10) {
                return 0;
            }
            
            number = number * 10 + digit;
            x = x / 10;
        }

        return number;
    }
}
