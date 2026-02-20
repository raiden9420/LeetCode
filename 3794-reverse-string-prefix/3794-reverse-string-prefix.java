class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder stb = new StringBuilder();
        for(int i = 0; i<k; i++){
            stb.append(s.charAt(i));
        }
        stb.reverse();
        for(int i = k; i<s.length(); i++){
            stb.append(s.charAt(i));
        }
    return stb.toString();
    }
}