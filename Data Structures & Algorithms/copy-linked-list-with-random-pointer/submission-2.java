/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        Node temp = head;

        while(temp != null){

            Node copy = new Node(temp.val);
            Node nextElement = temp.next;

            temp.next = copy;
            copy.next = nextElement;
            temp = nextElement;


        }



        temp = head;

        while(temp!= null){
            Node copy = temp.next;

            if(temp.random != null){
                copy.random = temp.random.next;

            }else{
                copy.random = null;
            }


            temp = temp.next.next;


        }


        temp = head;

        Node dummy = new Node(0);
        Node res = dummy;


        while(temp != null){

            res.next = temp.next;
            res = res.next;

            temp.next = temp.next.next;
            temp = temp.next;
        }




return dummy.next;






        
    }
}
