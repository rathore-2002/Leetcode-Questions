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
    public void markParents(TreeNode root,Map<TreeNode,TreeNode> map,TreeNode target){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr.left!=null){
                map.put(curr.left,curr);
                q.add(curr.left);
            }
            if(curr.right!=null){
                map.put(curr.right,curr);
                q.add(curr.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> map = new HashMap<>();
        markParents(root,map,target);
        HashMap<TreeNode,Boolean> visited = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        visited.put(target,true);
        int curr_level=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(curr_level==k)         break;
            curr_level++;
            for(int i=0;i<size;i++){
                TreeNode curr=q.remove();
                if(curr.left!=null && visited.get(curr.left)==null){
                    q.add(curr.left);
                    visited.put(curr.left,true);
                }
                 if(curr.right!=null && visited.get(curr.right)==null){
                    q.add(curr.right);
                    visited.put(curr.right,true);
                }
                if(map.get(curr)!=null && visited.get(map.get(curr))==null){
                    q.add(map.get(curr));
                    visited.put(map.get(curr),true);
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!q.isEmpty())
            ans.add(q.remove().val);
        
        return ans;
    }
}