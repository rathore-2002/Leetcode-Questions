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
    public boolean isLeaf(TreeNode root){
        if(root==null)
            return false;
        if(root.left==null && root.right==null)
            return true;
        return false;
    }
    public void helper(TreeNode root,ArrayList<Integer>a){
       
        if(root==null)
            return ;
        if(isLeaf(root))
            a.add(root.val);
        if(root.left!=null)
           helper(root.left,a);
        if(root.right!=null)
        helper(root.right,a);
 
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null)
            return true;
        if(root1==null || root2==null)
            return false;
        
       ArrayList<Integer> leaf1 = new ArrayList<>();
        ArrayList<Integer> leaf2 = new ArrayList<>();
        helper(root1,leaf1);
        helper(root2,leaf2);
        
        if(leaf1.size()!=leaf2.size())
            return false;
        for(int i=0;i<leaf1.size();i++)
            if(leaf1.get(i)!=leaf2.get(i))
                return false;
        
        return true;
    }
}