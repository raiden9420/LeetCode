class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        for(Character ch: s.toCharArray()){
            if(stk.isEmpty() || ch!=stk.peek()){
                stk.push(ch);
            }
            else{
                stk.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}