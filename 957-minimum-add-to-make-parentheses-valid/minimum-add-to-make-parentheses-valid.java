class Solution {
    public int minAddToMakeValid(String s) {

        ArrayList<Character> stack = new ArrayList<>();
        int top = -1;


        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);

            if(stack.isEmpty()){
                stack.add(c);
                top++;
                continue;
            }

            if(c == ')' && stack.get(top) == '('){
                stack.remove(top);
                top--;
            }
            else{
                stack.add(c);
                top++;
            }
        }

        return stack.size();
        
    }
}