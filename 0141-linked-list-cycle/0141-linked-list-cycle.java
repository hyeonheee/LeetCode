/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head){
       if(head==null) return false;
       
       ListNode fast=head.next; // 한번에 두 칸 이동
       ListNode slow=head; // 한번에 한 칸 이동
       
       while (slow!=fast){
           if(fast==null || fast.next==null) {
               return false;
           }
           slow=slow.next;
           fast=fast.next.next; // 두 칸 이동
       }
       return true; // slow == fast 
    }

}
