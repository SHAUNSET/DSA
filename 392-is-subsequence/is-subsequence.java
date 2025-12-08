class Solution {
    public boolean isSubsequence(String s, String t) {

        if (s.length() == 0) return true;


        Stack<Character> st = new Stack<>();


        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }

        for (int i = t.length() - 1; i >= 0 && !st.isEmpty(); i--) {

            if (t.charAt(i) == st.peek()) {
                st.pop();
            }
        }


        return st.isEmpty();
    }
}
