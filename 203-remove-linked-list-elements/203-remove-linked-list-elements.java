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
        ListNode curr = head; 
        ListNode previous = null; 
        
        while (curr != null) {
            if (curr.val == val) {
                if (curr == head) {
                    head = head.next; 
                    curr = head; 
                } else {
                    previous.next = curr.next;
                    curr = curr.next;
                }
            } else {
                previous = curr; 
                curr = curr.next; 
            }
        }
        
        return head; 
    } 
}