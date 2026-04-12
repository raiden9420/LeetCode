class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] counts = new int[256];
        int res = 0;

        for (char ch : chars.toCharArray()) {
            counts[ch]++;
        }

        for (String s : words) {
            if (good(s, counts.clone())) {
                res += s.length();
            }
        }
        return res; 
    }

    private boolean good(String s, int[] counts) {
        for (char ch : s.toCharArray()) { 
            counts[ch]--;
            if (counts[ch] < 0) {
                return false;
            }
        }
        return true; 
    }
}