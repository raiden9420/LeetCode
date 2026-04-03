class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();

        for(Character ch: s.toCharArray()){
            if(ch!='*') stk.push(ch);
            else{
                if(!stk.empty()) stk.pop();
               
            }
        }

        StringBuilder sb = new StringBuilder(stk.size());
        for (Character ch : stk) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
