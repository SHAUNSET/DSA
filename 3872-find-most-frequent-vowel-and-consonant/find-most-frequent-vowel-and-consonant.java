class Solution {
    public int maxFreqSum(String s) {

        int vowelcount = 0;
        int consoncount = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
    map.put(c, map.getOrDefault(c, 0) + 1);
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