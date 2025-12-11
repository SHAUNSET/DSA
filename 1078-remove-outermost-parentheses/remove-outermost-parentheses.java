class Solution {
    public String removeOuterParentheses(String s) {

        ArrayList<Character> stack = new ArrayList<>();
        StringBuilder ans = new StringBuilder();


        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);

            if(c == '('){
                if(!stack.isEmpty()){
                    ans.append(c);
                }
                stack.add(c);
            }
            else{
                stack.remove(stack.size() - 1);
                if (!stack.isEmpty()){
                    ans.append(c);
                }
            }
        }

        return ans.toString();

        
        
    }
}