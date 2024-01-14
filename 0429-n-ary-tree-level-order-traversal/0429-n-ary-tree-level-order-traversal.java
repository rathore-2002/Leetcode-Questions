/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> answer = new ArrayList<>();
        while(!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> levelNodes = new ArrayList<>();
            for(int i = 0; i < level; i++) {
                Node node = queue.poll();
                if (node != null) {
                    levelNodes.add(node.val);
                    List<Node> children = node.children;
                    if (!children.isEmpty()) {
                        for(Node child: children) {
                            queue.add(child);
                        }
                    }
                }
            }
            if (!levelNodes.isEmpty()) {
                answer.add(levelNodes);
            }
        }
        return answer;
    }
}