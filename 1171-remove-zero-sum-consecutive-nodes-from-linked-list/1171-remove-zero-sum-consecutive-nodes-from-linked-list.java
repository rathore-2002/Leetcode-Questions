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
    public ListNode removeZeroSumSublists(ListNode head) {
        if(head == null) return head;
        int tSum = 0;
        ListNode temp = head;
        while(temp != null){
            tSum += temp.val;
            if(tSum == 0){
                head = temp.next;
            }
            temp = temp.next;
        }
        if(head != null){
            head.next = removeZeroSumSublists(head.next);
        }
        return head;
    }
}