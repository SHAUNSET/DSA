class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

   
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}
