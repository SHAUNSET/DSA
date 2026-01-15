class Solution {
    public int maxRepeating(String sequence, String word) {

        int count = 0;
        String repeated = word;

        while (sequence.contains(repeated)) {
            count++;
            repeated = repeated + word;
        }

        return count;
    }
}
