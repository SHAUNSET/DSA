import java.util.HashMap;

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = getDigitSum(i);

            map.put(sum, map.getOrDefault(sum, 0) + 1);

            max = Math.max(max, map.get(sum));
        }

        return max;
    }

    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}