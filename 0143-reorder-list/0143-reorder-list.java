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
    public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode back = head;
        int s;

        while (back != null) {
            stack.add(back);
            back = back.next;
        }

        s = stack.size();

        for (int i = 0; i < s / 2; i++) {
            back = stack.pop();
            back.next = head.next;
            head.next = back;
            head = back.next;
        }

        head.next = null;
    }
}
