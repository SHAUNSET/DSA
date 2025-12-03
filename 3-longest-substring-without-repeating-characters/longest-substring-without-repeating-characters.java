class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxlen = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (map.containsKey(c)) {
                map.remove(s.charAt(left));
                left++;
            }

            map.put(c, 1);

            maxlen = Math.max(maxlen, right - left + 1);
        }

        return maxlen;
    }
}
