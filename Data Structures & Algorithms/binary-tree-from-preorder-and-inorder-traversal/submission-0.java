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
    public TreeNode buildTree(int[] preorder, int[] inorder) {


        HashMap<Integer, Integer> imap = new HashMap<Integer, Integer>();

        for(int i = 0; i<inorder.length; i++){

            imap.put(inorder[i], i);
        }


        TreeNode root = buildTree(preorder, 0 , preorder.length -1, 
                  inorder, 0 , inorder.length - 1, imap);

                  return root;

    }


    public TreeNode buildTree(int[] preorder, int startpre, int endpre,int[] inorder, int startin, int endin, HashMap<Integer, Integer> imap){


        if(startpre > endpre || startin > endin){

            return null;

        }


        TreeNode root = new TreeNode(preorder[startpre]);

        int inRoot = imap.get(root.val);
        int numsLeft = inRoot - startin;


       root.left =  buildTree(preorder, startpre + 1, startpre + numsLeft, inorder, startin, inRoot -1, imap);

       root.right = buildTree(preorder, startpre + numsLeft + 1, endpre, inorder , inRoot + 1, endin, imap);

return root;


    }





}
