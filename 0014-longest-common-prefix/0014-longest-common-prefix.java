class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder stb = new StringBuilder();
        if(strs.length == 1) return strs[0];
        if(strs.length == 0) return "";
        for(int i =0; i<strs.length-1; i++){
            char ch = strs[0].charAt(i);
            if(strs[i+1].charAt(i)==ch){
                stb.append(ch);
            }
        }
        return stb.toString();
    }
}