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
    class Pair{
        int num;
        TreeNode node;
        public Pair(int num,TreeNode node){
            this.num=num;
            this.node=node;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)  return 0;
        Queue<Pair> q = new LinkedList<>();
        int ans=0;
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            int size=q.size();
            int min=q.peek().num;
            int first=0,last=0;
            for(int i=0;i<size;i++){
                int curr=q.peek().num-min;
                TreeNode node=q.peek().node;
                q.remove();
                if(i==0)    first=curr;
                if(i==size-1)   last=curr;
                if(node.left!=null)        q.add(new Pair(curr*2+1,node.left));
                if(node.right!=null)       q.add(new Pair(curr*2+2,node.right));
            }
            ans=Math.max(ans,last-first+1);
        }
        return ans;
    }
}