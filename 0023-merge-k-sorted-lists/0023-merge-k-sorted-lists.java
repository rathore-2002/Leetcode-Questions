/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode>pq= new PriorityQueue<ListNode>((a,b)-> a.val-b.val);
        for(ListNode x : lists){
            if(x!=null)
            pq.add(x);
        }
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(!pq.isEmpty()){
            temp.next=pq.remove();
            temp=temp.next;
            if(temp.next!=null)
                pq.add(temp.next);
        }
        
        return dummy.next;
    }
}