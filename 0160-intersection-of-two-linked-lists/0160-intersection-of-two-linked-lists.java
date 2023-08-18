/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int Size(ListNode head){
      int ctr=0;
       ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            ctr++; 
        }
        return ctr;
}
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA,temp2=headB;
        int diff=Math.abs(Size(headA)-Size(headB));
        if(Size(headA)>Size(headB)){
            int i=0;
            while(i<diff){
                temp1=temp1.next;
                i++;
            }
        }
        else if(Size(headA)<Size(headB)){
            int i=0;
            while(i<diff){
                temp2=temp2.next;
                i++;
            }
        }
            
        while(temp1!=null && temp2!=null){
            if(temp1==temp2)
                return temp1;
            
            temp1=temp1.next;
            temp2=temp2.next;
        }    
                return null;
        
    }
}