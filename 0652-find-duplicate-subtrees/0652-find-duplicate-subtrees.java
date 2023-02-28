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

    private Map<MyTreeNode, Integer> countMap = new HashMap<>();
    private List<TreeNode> duplicates = new LinkedList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return duplicates;
    }

    private MyTreeNode dfs(TreeNode node) {
        if(node == null) {
            return null;
        }

        MyTreeNode left = dfs(node.left);
        MyTreeNode right = dfs(node.right);

        int prime = 31;
        int hash = 1;
        hash = hash * prime + node.val;
        if(left != null) {
            hash = hash * prime + left.hash;
        }

        if(right != null) {
            hash = hash * prime + right.hash;
        }

        MyTreeNode myNode = new MyTreeNode(hash, node.val, left, right);
        int count = countMap.getOrDefault(myNode, 0) + 1;
        countMap.put(myNode, count);
        if(count == 2) {
            duplicates.add(node);
        }

        return myNode;
    }

    private class MyTreeNode {
        private int hash;
        private int val;
        private MyTreeNode left;
        private MyTreeNode right;

        public MyTreeNode(int h, int v, MyTreeNode l, MyTreeNode r) {
            this.hash = h;
            this.val = v;
            this.left = l;
            this.right = r;
        }

        @Override
        public int hashCode() {
            return hash;
        }

        @Override
        public boolean equals(Object o) {
            MyTreeNode node = (MyTreeNode) o;
            return this.hash == node.hash && this.val == node.val && equals(node.left, this.left) && equals(node.right, this.right);
        }

        private boolean equals(MyTreeNode a, MyTreeNode b) {
            if(a == null && b == null) {
                return true;
            }

            if(a == null || b == null) {
                return false;
            }

            return a.equals(b);
        }
    }

}