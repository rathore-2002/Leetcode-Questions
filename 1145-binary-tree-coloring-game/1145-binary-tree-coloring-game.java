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
        static int xkaleft;
        static int xkaright;
        
        public static int size(TreeNode node,int x){
                if(node == null){
                        return 0;
                }
                
                int ls = size(node.left,x);
                int rs = size(node.right,x);
                
                int ts = ls + rs + 1;
                
                if(node.val == x){
                        xkaleft = ls;
                        xkaright = rs;
                }
                return ts;
                
        }
        public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
                
                size(root,x);
                
                int otherside = n - (xkaleft + xkaright + 1);
                int maxofthree = Math.max(otherside,Math.max(xkaleft,xkaright));
                
                int rest = n - maxofthree;
                
                if(maxofthree > rest){
                        return true;
                }
                
                return false;
        
    }
}