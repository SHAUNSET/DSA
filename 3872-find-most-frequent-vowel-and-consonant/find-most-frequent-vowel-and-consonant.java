class Solution {
    public int maxFreqSum(String s) {

        int vowelcount = 0;
        int consoncount = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : map.keySet()) {
            if (c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u') {
                vowelcount = Math.max(vowelcount, map.get(c));
            } else {
                consoncount = Math.max(consoncount, map.get(c));
            }
        }

        return vowelcount + consoncount;
    }
}