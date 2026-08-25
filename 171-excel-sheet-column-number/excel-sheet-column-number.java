class Solution {
    public int titleToNumber(String columnTitle) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c = 'A'; c <= 'Z'; c++) {
            map.put(c, c - 'A' + 1);
        }

        int ans = 0;
        int power = 0;

        for (int i = columnTitle.length() - 1; i >= 0; i--) {

            char ch = columnTitle.charAt(i);

            ans += map.get(ch) * Math.pow(26, power);

            power++;
        }

        return ans;
    }
}