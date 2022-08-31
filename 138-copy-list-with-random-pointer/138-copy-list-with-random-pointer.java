/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       HashMap<Node,Node> map = new HashMap<>();
        Node curr = head;
        while(curr!=null){
            map.put(curr,new Node(curr.val));
            curr=curr.next;
        }
        curr = head;
        Node newHead = map.get(curr);
        Node newCurr = newHead;
        
        while(newCurr!=null){
            newCurr.next=map.get(curr.next);
            newCurr.random=map.get(curr.random);
            curr=curr.next;
            newCurr=newCurr.next;
        }
        return newHead;
    }
}