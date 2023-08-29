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
    public ListNode reverseList(ListNode head) {
        return changeDirection(head, null);
    }
    
    public ListNode changeDirection(ListNode head, ListNode newHead) {
        
        if(head == null) {
            return newHead;
        }
        
        ListNode nextNode = head.next; // 2 -> 3 -> 4 -> 5
        head.next = newHead; // 1 -> null
        newHead = head; // 1 -> null
        head = nextNode; // 2 -> 3 -> 4 -> 5
        
        return changeDirection(head, newHead);
    }
}