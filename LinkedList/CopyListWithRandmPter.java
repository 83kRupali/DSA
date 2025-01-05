//Copy List with random pointer
//leetcode:138
//Time complexity : O(n)

import java.util.HashMap;

public class CopyListWithRandmPter {

    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }

        //store the old and new Temp
        HashMap<Node, Node>map = new HashMap<>();
        
        //Copy of head ----> newHead
        Node newHead =  new Node(head.val);

        //old list to the next -----> oldTemp
        Node oldTemp = head.next;

        //new list to the next -----> newTemp
        Node newTemp = newHead;

        // add in map
        map.put(head, newHead);

        while(oldTemp != null){

            //copy the Node;
            Node copyNode = new Node(oldTemp.val);
            
            // for the random pointer know
            map.put(oldTemp, copyNode);

            //copy the Node in new list
            newTemp.next = copyNode;

            // update Node
            oldTemp = oldTemp.next;
            newTemp = newTemp.next;

        }

        // Copy Node to random pointer
        oldTemp = head;
        newTemp = newHead;

        while(oldTemp != null){

            //search the address in the pointer which point to the random Node

            newTemp.random = map.get(oldTemp.random);

            //update the node;
            oldTemp = oldTemp.next;
            newTemp = newTemp.next;   
        }

        // return the copyList head
        return newHead;

    }
    public static void main(String[] args) {
        
    }
}
