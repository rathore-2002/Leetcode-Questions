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
    public int count(ListNode head){
        if(head==null)  return 0;
        ListNode temp=head;
        int ctr=0;
        while(temp!=null){
            ctr++;
            temp=temp.next;
        }
        return ctr;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        
        int size=count(head);
        
        //join tail to head;
        ListNode temp = head;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=head;
        
        //move k times to make newHead and null
        k=k%size;
        k=size-k;
        ListNode temp1=head;
        while(k>1){
            temp1=temp1.next;
            k--;
        }
        ListNode newHead=temp1.next;
        temp1.next=null;
        return newHead;
    }
}