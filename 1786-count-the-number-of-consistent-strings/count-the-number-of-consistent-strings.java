class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        boolean[] allowedChars = new boolean[26];

        for (int i = 0; i < allowed.length(); i++) {
            allowedChars[allowed.charAt(i) - 'a'] = true;
        }

        int count = 0;

        for (String word : words) {
            boolean isConsistent = true;

            for (int i = 0; i < word.length(); i++) {
                if (!allowedChars[word.charAt(i) - 'a']) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) count++;
        }

        return count;
    }
}
