class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet <Integer> set = new HashSet<>();
        int n = nums.length;
        for(String i : nums){
            set.add(Integer.parseInt(i,2));
        }

        int limit = 1<<n;

        for(int i=0; i<limit; i++){
            if (!set.contains(i)) {
                String res = Integer.toBinaryString(i);
                while (res.length() < n) {
                    res = "0" + res;
                }
                return res;

            }
        }

        return "";

    }
}