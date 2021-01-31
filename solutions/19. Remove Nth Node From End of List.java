/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) {
           return null;
        }
        int count = 0;
        ListNode temp = head;
        while (count < n-1) {
            temp = temp.next;
            count++;
        }
        
        ListNode prev = null;
        ListNode curr = head;
​
        while(temp.next != null) {
            prev = curr;
            curr = curr.next;
            temp = temp.next;
        }
        
        if (prev == null) {
            return curr.next;
        } else {
            prev.next = (curr == null)? null: curr.next;    
        }
        return head;
    }
}
