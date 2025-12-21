class Solution {
    public int bitwiseComplement(int n) {

        if (n == 0) return 1;

        int num = 0;
        int place = 1;   

        while (n > 0) {
            int digit = n % 2;
            n = n / 2;

            if (digit == 1) {
                digit = 0;
            } else {
                digit = 1;
            }

            num = num + digit * place;
            place = place * 2;
        }

        return num;
    }
}
