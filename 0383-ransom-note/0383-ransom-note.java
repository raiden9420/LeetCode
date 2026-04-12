class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counts = new int[256];
        for( char ch : magazine.toCharArray()) counts[ch]++;
        for( char ch : ransomNote.toCharArray()) {
            counts[ch]--;
            if(counts[ch]<0) return false;
        }
        return true;
    }
}