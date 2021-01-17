/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTRecursive(nums, 0 , nums.length-1);
    }
    
    public TreeNode sortedArrayToBSTRecursive(int[] nums, int start, int end)
    {
        
        if(start > end)
            return null;
        
        if(start == end)
            return new TreeNode(nums[start]);
        
        int mid = start + (end - start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBSTRecursive(nums, start, mid-1);
        root.right = sortedArrayToBSTRecursive(nums, mid+1, end);
        return root;
    }
}
