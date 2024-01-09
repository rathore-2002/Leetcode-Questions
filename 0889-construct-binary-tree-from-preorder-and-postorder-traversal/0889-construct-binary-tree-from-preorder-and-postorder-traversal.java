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
    private int getIndex(int val, int[] arr, int start, int end) {
        for(int i=start; i<=end; i++) {
            if(arr[i] == val){
                return i;
            }
        }
        return 0;
}   
    private TreeNode constructTree(int pre_st, int pre_en, int pos_st, int pos_en, int[] preorder, int[] postorder) {
        if(pre_st > pre_en || pos_st > pos_en) return null;
        if(pre_st == pre_en || pos_st == pos_en) return new TreeNode(preorder[pre_st]);

        int rootNode = preorder[pre_st];
        TreeNode root = new TreeNode(rootNode);
        int indexOfLeftRoot = getIndex(preorder[pre_st+1], postorder, pos_st, pos_en);
        int numberOfEleInLeft = indexOfLeftRoot - pos_st + 1;
        root.left = constructTree(pre_st+1, pre_st + numberOfEleInLeft, pos_st, indexOfLeftRoot, preorder, postorder);
        root.right = constructTree(pre_st + numberOfEleInLeft + 1, pre_en, indexOfLeftRoot+1, pos_en-1, preorder, postorder);
        return root;
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return constructTree(0, preorder.length-1, 0, postorder.length-1, preorder, postorder);
    }
}