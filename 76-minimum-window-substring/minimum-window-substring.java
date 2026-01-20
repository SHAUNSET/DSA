class Solution {
    public String minWindow(String s, String t) {

        if (t.length() > s.length()) return "";

        HashMap<Character, Integer> map = new HashMap<>();

        // 1. Build frequency map of t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;

        int count = t.length(); 
        int minLen = Integer.MAX_VALUE;
        int start = 0; 


        while (right < s.length()) {
            char c = s.charAt(right);

            if (map.containsKey(c)) {
                if (map.get(c) > 0) {
                    count--; 
                }
                map.put(c, map.get(c) - 1);
            }

            right++;


            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) > 0) {
                        count++; 
                    }
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
