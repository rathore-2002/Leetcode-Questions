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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)     return ans;
        q.add(root);
        int flag=0;
        while(!q.isEmpty()){
            ArrayList<Integer> a = new ArrayList<>();
            int levelNo=q.size();
            for(int i=0;i<levelNo;i++){
                if(q.peek().left!=null)       q.add(q.peek().left);
                if(q.peek().right!=null)       q.add(q.peek().right);
                a.add(q.remove().val);
            }
                if(flag==1)
                    Collections.reverse(a);
                
            ans.add(a);
            if(flag==0)    flag=1;
            else           flag=0;
        }
        return ans;
    }
}