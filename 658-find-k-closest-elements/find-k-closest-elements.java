import java.util.*;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<int[]> list = new ArrayList<>();


        for (int num : arr) {
            list.add(new int[]{num, Math.abs(num - x)});
        }


        Collections.sort(list, (a, b) -> {
            if (a[1] != b[1]) {
                return a[1] - b[1];  
            }
            return a[0] - b[0];      
        });


        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(list.get(i)[0]);
        }

        Collections.sort(result);

        return result;
    }
}