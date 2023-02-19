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
    public ListNode removeElements(ListNode head, int val) {
        int flag=0;
        if(head==null)  return null;
        if(head.val==val) flag=1;
        ListNode temp = head;
        while(temp.next!=null){
            if(temp.next.val==val)
                temp.next=temp.next.next;
            else
                temp=temp.next;
        }
        if(flag==1) return head.next;
        return head;
    }
}