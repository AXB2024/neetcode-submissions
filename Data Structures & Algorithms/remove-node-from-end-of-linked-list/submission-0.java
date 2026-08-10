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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        // Find length
        int length = 0;
        ListNode curr = head;

        while (curr != null) {
            length++;
            curr = curr.next;
        }

        // Find node before the one we want to remove
        int position = length - n;

        ListNode prev = dummy;

        for (int i = 0; i < position; i++) {
            prev = prev.next;
        }

        // Remove node
        prev.next = prev.next.next;

        return dummy.next;
    }
}
