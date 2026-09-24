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


    /*    Node temp = head;

        HashMap<Node,Node> map = new HashMap<>();

        while(temp != null){

            Node copyNode = new Node(temp.val);

            map.put(temp, copyNode);

            temp = temp.next;

        }


        temp = head;

        while(temp != null){

            Node copyNode = map.get(temp);

            copyNode.next = map.get(temp.next);

            copyNode.random = map.get(temp.random);

            temp = temp.next;
        }


        return map.get(head);
*/

       //Create new nodes and insert them in between
        Node temp = head;

        while(temp != null){
            Node copy = new Node(temp.val);
            Node nextElement = temp.next;

            temp.next = copy;
            copy.next = nextElement;
            temp = nextElement;
        }

        //Connect random pointers of copy nodes
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


        //disconnect the two LLs

        temp = head;

        Node dummy = new Node(0);
        Node res = dummy;

        while(temp != null){

            res.next = temp.next;
            res=res.next;

            temp.next = temp.next.next;
            temp = temp.next;

        }
    


        return dummy.next;
        
        
    }
}
