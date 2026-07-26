class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : barcodes) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[][] nums = new int[map.size()][2];

        int index = 0;
        for (int num : map.keySet()) {
            nums[index][0] = num;
            nums[index][1] = map.get(num);
            index++;
        }

        int[] result = new int[barcodes.length];

        int previous = -1;
        int k = 0;

        while (k < barcodes.length) {

            int selected = -1;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i][1] > 0 &&
                    nums[i][0] != previous &&
                    (selected == -1 || nums[i][1] > nums[selected][1])) {

                    selected = i;
                }
            }

            result[k] = nums[selected][0];
            previous = nums[selected][0];
            nums[selected][1]--;

            k++;
        }

        return result;
    }
}