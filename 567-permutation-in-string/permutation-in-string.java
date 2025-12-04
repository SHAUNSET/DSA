class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

  
        for(char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        int windowSize = s1.length();

        for(int i = 0; i < windowSize; i++) {
            char c = s2.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        if(map1.equals(map2)) return true;


        for(int i = windowSize; i < s2.length(); i++) {
            char newChar = s2.charAt(i);
            char leftChar = s2.charAt(i - windowSize);

  
            map2.put(newChar, map2.getOrDefault(newChar, 0) + 1);

            if(map2.get(leftChar) == 1) {
                map2.remove(leftChar);
            } else {
                map2.put(leftChar, map2.get(leftChar) - 1);
            }

            if(map1.equals(map2)) return true;
        }

        return false;
    }
}
