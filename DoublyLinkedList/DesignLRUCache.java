import java.util.HashMap;

class DesignLRUCache{

    class Node{
        int key;
        int val;
        Node prev;
        Node next;

        Node(int k, int v){
            key = k;
            val = v;
            prev = null;
            next = null;
        }
    }

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);

    HashMap<Integer, Node>map = new HashMap<>();
    int limit;


    void addNode(Node newNode){
        Node oldNext = head.next;

        head.next = newNode;
        oldNext.prev = newNode;

        newNode.next = oldNext;
        newNode.prev = head;

    }

    void delNode(Node oldNode){
        Node oldPrev = oldNode.prev;
        Node oldNext = oldNode.next;

        oldPrev.next = oldNext;
        oldNext.prev = oldPrev;
    }


    public DesignLRUCache(int capacity){
        limit = capacity;
        head.next = tail;
        tail.prev = head;
    }



    int get(int key){     //O(1)

        if(!map.containsKey(key)){
            return -1;
        }

        Node ansNode = map.get(key);
        int ans = ansNode.val;

        delNode(ansNode);
        //map.remove(key);
        addNode(ansNode);

        return ans;

    }

    void put(int key, int val){    //O(1)

        if(map.containsKey(key)){
            Node oldNode = map.get(key);
            delNode(oldNode);
            map.remove(key);
        }


        if(map.size() == limit){

            //delete LRU data
            map.remove(tail.prev.key);
            delNode(tail.prev);
        }

        Node newNode = new Node(key, val);
        addNode(newNode);
        map.put(key, newNode);

    }

    public static void main(String[] args) {
        DesignLRUCache dLRU = new DesignLRUCache(2);
        dLRU.put(1, 1);
        dLRU.put(2, 2);
        System.out.println(dLRU.get(1));
        dLRU.put(3, 3);
        System.out.println(dLRU.get(2));
        dLRU.put(4, 4);
        System.out.println(dLRU.get(1));
        System.out.println(dLRU.get(3));
        System.out.println(dLRU.get(4));
    }
}