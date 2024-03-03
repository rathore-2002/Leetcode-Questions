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
        ListNode temp = head;
        int count=0;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = size(head);
        if(n==len)          return head.next;
        ListNode temp=head;
        int i=1;
        while(i<len-n){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
    }
}