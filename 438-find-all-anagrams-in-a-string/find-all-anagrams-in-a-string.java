class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int left = 0;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();


        for(int i = 0 ; i < p.length(); i++){
            char c = p.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        int windowSize = p.length();

        for(int i = 0; i < windowSize && i < s.length(); i++) {
            char c = s.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        if(map1.equals(map2)){
            list.add(0);
        }

        for(int i = windowSize; i < s.length(); i++) {

            char newChar = s.charAt(i);
            map2.put(newChar, map2.getOrDefault(newChar, 0) + 1);

            char leftChar = s.charAt(i - windowSize);
            if(map2.get(leftChar) == 1) {
                map2.remove(leftChar);
            } else {
                map2.put(leftChar, map2.get(leftChar) - 1);
            }

            if(map1.equals(map2)){
                list.add(i - windowSize + 1);
            }
        }

        return list;
    }
}
