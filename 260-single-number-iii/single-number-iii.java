import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        ArrayList<Integer> singles = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                singles.add(key);
            }
        }


        int[] result = new int[singles.size()];
        for (int i = 0; i < singles.size(); i++) {
            result[i] = singles.get(i);
        }

        return result;
    }
}
