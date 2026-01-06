class Solution {
    public boolean rotateString(String s, String goal) {


        if (s.length() != goal.length()) {
            return false;
        }

        int n = s.length();
        if (n == 0) {
            return true; 
        }

        char firstChar = s.charAt(0);

        for (int i = 0; i < n; i++) {
            if (goal.charAt(i) == firstChar) {

                String rotated = goal.substring(i) + goal.substring(0, i);


                if (rotated.equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }
}
