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
    public ListNode partition(ListNode head, int x) {
        if(head==null) return head;
        ListNode leftdummy = new ListNode(0);
        ListNode rightdummy = new ListNode(0);
        ListNode left=leftdummy;
        ListNode right=rightdummy;
        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x){
                left.next=temp;
                left=left.next;
            }
            else{
                right.next=temp;
                right=right.next;
            }
            temp=temp.next;
            
        }
        left.next=rightdummy.next;
        right.next=null;
            return leftdummy.next;
                
    }
}