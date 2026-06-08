import java.util.Arrays;

class Solution {
    public int findRadius(int[] houses, int[] heaters) {

        Arrays.sort(houses);
        Arrays.sort(heaters);

        int maxDist = 0;

        for (int h : houses) {

            int minDist = Integer.MAX_VALUE;

            for (int ht : heaters) {
                minDist = Math.min(minDist, Math.abs(h - ht));
            }

            maxDist = Math.max(maxDist, minDist);
        }

        return maxDist;
    }
}