class Solution {
    public int maximumSum(int[] nums) {

        Arrays.sort(nums);
        int maxSum = 0;

        List<Integer> r0 = new ArrayList<>();
        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            if(nums[i]%3 == 0) r0.add(nums[i]);
            else if(nums[i]%3 == 1) r1.add(nums[i]);
            else r2.add(nums[i]);
        }

        maxSum = (r0.size() >= 3) ? Math.max(maxSum, r0.get(0) + r0.get(1) + r0.get(2)) : maxSum;
        maxSum = (r1.size() >= 3) ? Math.max(maxSum, r1.get(0) + r1.get(1) + r1.get(2)) : maxSum;
        maxSum = (r2.size() >= 3) ? Math.max(maxSum, r2.get(0) + r2.get(1) + r2.get(2)) : maxSum;
        maxSum = (r0.size() >= 1 && r1.size() >= 1 && r2.size() >= 1) ? Math.max(maxSum, r0.get(0) + r1.get(0) + r2.get(0)) : maxSum;

        return maxSum;
    }
}