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
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        if (root.left != null && root.val <= getMax(root.left))
            return false;
        if (root.right != null && root.val >= getMin(root.right))
            return false;                
        return (isValidBST(root.left) && isValidBST(root.right));
    }
    
    public int getMax(TreeNode root) {
        while (root.right !=  null) {
            root = root.right;
        }
        return root.val;
    }
    
    public int getMin(TreeNode root) {
        while (root.left !=  null) {
            root = root.left;
        }
        return root.val;
    }
}
