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
private int maxDiameter = 0; 

    public int diameterOfBinaryTree(TreeNode root) {

        int diam = calculateHeight(root);

        return maxDiameter;

    }


    public int calculateHeight (TreeNode root){

        if(root == null){
            return 0;
        }


        int diam1 = calculateHeight(root.left);
        int diam2 = calculateHeight(root.right);


        maxDiameter = Math.max(maxDiameter, diam1 + diam2);

        return 1 + Math.max(diam1, diam2);
    }
}
