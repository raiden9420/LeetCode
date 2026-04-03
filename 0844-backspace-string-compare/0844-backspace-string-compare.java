class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk = new Stack<>();
        Stack<Character> stk2 = new Stack<>();

        for(Character ch: s.toCharArray()){
            if(ch!='#') stk.push(ch);
            else{
                if(!stk.empty()) stk.pop();
               
            }
        }

        StringBuilder sb = new StringBuilder(stk.size());
        for (Character ch : stk) {
            sb.append(ch);
        }

        for(Character ch: t.toCharArray()){
            if(ch!='#') stk2.push(ch);
            else{
                if(!stk2.empty()) stk2.pop();
               
            }
        }

        StringBuilder sb2 = new StringBuilder(stk2.size());
        for (Character ch : stk2) {
            sb2.append(ch);
        }

        if(sb.toString().equals(sb2.toString()))return true;
        
    return false;
    }
}
