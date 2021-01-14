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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     if(l1 == null && l2 == null)
     {
         return null;
     }
     if(l1 == null || l2 == null)
     {
          return l1 == null? l2 : l1;
     }
     ListNode temp = null;
     ListNode l3 =  new ListNode(5);
    ListNode dummy = l3;
     while (l1 != null && l2 != null)
     {
         if(l1.val <= l2.val)
         {
            temp = new ListNode(l1.val);
            l1 = l1.next;    
         }
         else 
         {
            temp = new ListNode(l2.val);
            l2 = l2.next; 
         }
         
         temp.next = null;
             l3.next = temp;
             l3 = l3.next;
     }
    if(l1 != null)
    {
        l3.next = l1;
    }
    else if(l2 != null)
    {
        l3.next = l2;
    }
        return dummy.next;
    }
}
