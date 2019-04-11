/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        TreeNode current = root;
        while(true){
            if(current.val <= val)
                if(current.right != null)
                    current = current.right;
                else{
                    current.right = new TreeNode(val);
                    break;
                }
        else {
            if(current.left != null)
                current = current.left;
            else{
                current.left = new TreeNode(val);
                break;
            }
        }
        }
        return root;
    }
}
