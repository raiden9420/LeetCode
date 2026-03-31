/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return createTree(nums, 0, nums.length - 1);
    }

    public TreeNode createTree(int[] nums, int start, int end) {
        if (start > end) return null;
        int ind = maxIndex(nums, start, end);

        TreeNode node = new TreeNode(nums[ind]);

        node.left = createTree(nums, start, ind - 1);
        node.right = createTree(nums, ind + 1, end);

        return node;
    }

    public int maxIndex(int[] nums, int start, int end){
        int index = start;
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] > nums[index]) {
                index = i;
            }
        }
        return index;
    }
}