//package Apna_College.Hashing;

import java.util.HashMap;
import java.util.Set;

public class Iteration {

    //O(1)
    public static void main(String[] args) {
         // Create 
        HashMap<String, Integer>hm = new HashMap<>();
 
        //Insert O(1)
        hm.put("India", 100);
        hm.put("china", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 100);
        hm.put("Nepal", 150);
        hm.put("Butan", 50);

        System.err.println(hm);
        System.out.println();

        Set<String> keys = hm.keySet();
        System.out.println(keys);
        System.out.println();

        for(String k : keys){
            System.out.print("Key: "+k+" value:"+hm.get(k));
        }
        System.out.println();
    }
}
