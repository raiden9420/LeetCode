class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> stk = new Stack<>();
        for(String s : tokens){
            if(!(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))){
                int num = Integer.parseInt(s);
                stk.push(num);
            }else{
                int b = stk.pop();
                int a = stk.pop();
                if(s.equals("+")){
                     int result=a+b; stk.push(result);
                }
                if(s.equals("-")){
                     int result=a-b; stk.push(result);
                }
                if(s.equals("*")){
                     int result=a*b; stk.push(result);
                }
                if(s.equals("/")){
                     int result=a/b; stk.push(result);
                }
                
            }
        }
        return stk.pop();
    }
}