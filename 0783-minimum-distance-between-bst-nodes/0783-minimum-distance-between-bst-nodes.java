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
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
		list = helper(root,list);
		int min = Math.abs(list.get(0)-list.get(1));
		for (int i = 1; i < list.size()-1; i++)
			min = Math.min(min, Math.abs(list.get(i)-list.get(i+1)));
        return min;
    }
    public static ArrayList<Integer> helper(TreeNode root,ArrayList<Integer> list){
		if (root != null) {
			helper(root.left,list);
			list.add(root.val);
	        helper(root.right,list);
	    }
		return list;
    }
}