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


        ListNode slow = head;
        ListNode fast = head.next;


        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode currNode = slow.next;
        ListNode prev = slow.next = null;


        while(currNode != null){

            ListNode nextNode = currNode.next;

            currNode.next = prev;
            prev = currNode;
            currNode = nextNode;

        }


        ListNode first = head;
        currNode = prev;


        while(currNode != null){
            ListNode tmp1 = first.next;
            ListNode tmp2 = currNode.next;
            first.next = currNode;
            currNode.next = tmp1;
            first = tmp1;
            currNode = tmp2;
        }
        
    }
}
