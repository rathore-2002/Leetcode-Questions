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
    public int size(ListNode head){
        int ctr=0;
        ListNode temp=head;
        while(temp!=null){
            ctr++;
            temp=temp.next;
        }
        return ctr;
        
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=size(head);
        if(size==n)
            return head.next;
        ListNode temp = head;
        int i=1;
        while(i<size-n){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
    }
}