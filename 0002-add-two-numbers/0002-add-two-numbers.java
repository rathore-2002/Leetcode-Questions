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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int n1=l1==null?0 : l1.val;
            int n2=l2==null ? 0 : l2.val;
            int res=n1+n2+carry;
            carry=res/10;
            ListNode newNode = new ListNode(res%10);
            temp.next=newNode;
            temp=newNode;
            
            if(l1!=null)   l1=l1.next;
            if(l2!=null)    l2=l2.next;
        }
        return dummy.next;
    }
}