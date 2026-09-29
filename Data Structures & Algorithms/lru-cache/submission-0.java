public class Node{
    int key;
    int val;
    Node prev;
    Node next;


    public Node(int key, int val){
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }

}


class LRUCache {

    private int cap;
    private HashMap<Integer, Node> map;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {

        this.cap = capacity;
        this.map = new HashMap<>();
        this.head = new Node(0,0);
        this.tail = new Node(0,0);

        this.head.next = this.tail;
        this.tail.prev = this.head;
        
    }

    private void delete(Node node){

        Node prev = node.prev;
        Node nxt = node.next;
        prev.next = nxt;
        nxt.prev = prev;

    }


    private void insert(Node node){

        Node nxt = this.head.next;
        this.head.next = node;
        node.next = nxt;
        node.prev = head;
        nxt.prev = node;

    }

    
    public int get(int key) {

        if(map.containsKey(key)){
            Node node = map.get(key);
            delete(node);
            insert(node);
            return node.val;
        }

        return -1;
        
    }
    
    public void put(int key, int value) {

        if(map.containsKey(key)){
            delete(map.get(key));
        }

        Node newNode = new Node(key,value);
        map.put(key, newNode);
        insert(newNode);

        if(map.size() > cap){
            Node prev = tail.prev;
            delete(prev);
            map.remove(prev.key);
        }





        
    }
}
