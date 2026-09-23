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

       ListNode temp = new ListNode(0);

       temp = head;
       int length =0;

       while(temp != null){
            length++;
            temp = temp.next;
            
       }

       int newLength = (length - n) ;

        if (newLength == 0) {
            return head.next;
        }

        temp = head;
       for(int i = 0; i<newLength-1; i++){


            temp = temp.next;
       }

        temp.next = temp.next.next;

        return head;

    }
}
