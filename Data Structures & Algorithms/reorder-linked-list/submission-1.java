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

        //finding the middle of the LL
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }


        //Reversing the second half of the LL

        ListNode currNode = slow.next;
        ListNode prevNode = slow.next = null;

        while(currNode != null){
            ListNode nextNode = currNode.next;
                
                currNode.next = prevNode;
                prevNode = currNode;
                currNode = nextNode;

        }


        ListNode first = head;
        ListNode second = prevNode;


        while(second != null){
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;


            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }






}
}
