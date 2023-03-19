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
    private ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode merge(ListNode head1,ListNode head2){
        if(head1==null) return head2;
        if(head2==null) return head1;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
                head1=head1.next;
                temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
                head2=head2.next;
                temp=temp.next;
        }
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)  return head;
        ListNode mid=middle(head);
        ListNode Rhead=mid.next;
        mid.next=null;
        ListNode newLeft=sortList(head);
        ListNode newRight=sortList(Rhead);
        return merge(newLeft,newRight);
    }
}