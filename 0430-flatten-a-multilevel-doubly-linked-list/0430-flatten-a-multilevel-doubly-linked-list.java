/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node curr = head;

        while(curr != null) {
            if(curr.child != null) {
                Node tail = helper(curr.child);

                if(curr.next != null)
                    curr.next.prev = tail;

                tail.next = curr.next;
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;
            }
            
            curr = curr.next;
        }

        return head;
    }

    private Node helper(Node head) {
        while(head.next != null)
            head = head.next;

        return head;
    }
}