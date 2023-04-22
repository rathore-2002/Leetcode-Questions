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
        Node temp = head;
        while(temp!=null){
            Node newNode = new Node(temp.val);
            map.put(temp,newNode);
            temp=temp.next;
        }
        Node curr=head;
        Node newHead=map.get(head);
        Node newcurr=map.get(head);
        while(curr!=null){
            newcurr.next=map.get(curr.next);
            newcurr.random=map.get(curr.random);
            newcurr=newcurr.next;
            curr=curr.next;
        }
        return newHead;
    }
}