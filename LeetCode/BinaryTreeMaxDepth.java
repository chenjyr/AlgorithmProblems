/**
 * Given a binary tree, find its maximum depth.
 * 
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public int maxDepth(TreeNode root) {
    
    if (root == null) return 0;
    if (root.left == null && root.right == null) return 1;
    
    return max(maxDepth(root.left), maxDepth(root.right)) + 1;
}

private int max(int x, int y) {
    return x > y ? x : y;
}