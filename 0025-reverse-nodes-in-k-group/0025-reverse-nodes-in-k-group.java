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
        int c=0;
        while(head!=null){
            c++;
            head=head.next;
        }
        return c;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
      if(head==null || head.next==null)      return head;
        ListNode curr=head,prev=null,next=null;
        int size=size(head);
        int c=0;
        if(size>=k){
        while(curr!=null && c<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            c++;
        }
        }
        else{
            prev=curr;
        }
        if(next!=null)       head.next=reverseKGroup(next,k);
        
        return prev;
    }
}