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
    public ListNode mid(ListNode head){
        ListNode temp = head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public void reorderList(ListNode head) {
        ListNode mid=mid(head);
        
        //reverse 2nd Half
        ListNode prev=null;
        ListNode curr=mid;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode lh=head;
        ListNode rh=prev;
        ListNode temp1,temp2;
        while(lh!=null && rh!=null){
            temp1=lh.next;
            lh.next=rh;
            temp2=rh.next;
            rh.next=temp1;
            
            rh=temp2;
            lh=temp1;
        }
        
    }
}