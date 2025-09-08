//package Apna_College.Hashing;

import java.util.LinkedList;
import java.security.Key;
import java.util.ArrayList;
import java.util.Set;

class Implementation {

    static class HashMap<K,V> {
        private class Node{
            K key;
            V value;

            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        
        private int n; //No. of Nodes
        private int N; //No. of buckets

        private LinkedList<Node> bucket[];
        
        HashMap(){
            this.N = 4;
            this.bucket = new LinkedList[4];

            for(int i=0; i<4; i++){
                this.bucket[i] = new LinkedList<>();
            }
        }

        public int hashCodeFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi)%N;
        }

        public int searchKey(K key, int bi){
            LinkedList<Node>ll = bucket[bi];
            int di = 0;
            for(int i=0; i<ll.size(); i++){
                if(ll.get(di).key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        public void rehash(){
            LinkedList<Node>oldLinkList[] = bucket;

            bucket = new LinkedList[N*2];
            N= N*2;

            for(int i=0; i<bucket.length; i++){
                bucket[i] = new LinkedList<>();
            }

            for(int i=0; i<bucket.length; i++){
                LinkedList<Node>ll = oldLinkList[i];

                for(int j=0; j<ll.size(); j++){
                    Node node = ll.remove(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = hashCodeFunction(key);
            int di = searchKey(key, bi);

            if(di != -1){
                Node node = bucket[bi].get(di);
                node.value = value;
            }
            else{
                bucket[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0){
                rehash();
            }
        }

        public V remove(K key){
            int bi = hashCodeFunction(key);
            int di = searchKey(key, bi);

            if(di != -1){
                Node node = bucket[bi].remove(di);
                n--;
                return node.value;
            }
            else{
                return null;
            }
        }

        public V get(K key){
            int bi = hashCodeFunction(key);
            int di = searchKey(key, bi);

            if(di != -1){
                Node node = bucket[bi].remove(di);
                return node.value;
            }
            else{
                return null;
            }
        }

        public boolean containsKey(K key){
            int bi = hashCodeFunction(key);
            int di = searchKey(key, bi);

            if(di != -1){
                return true;
            }
            else{
                return false;
            }
        }

        public ArrayList<K>KeySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<bucket.length; i++){
                LinkedList<Node>ll = bucket[i];

                for(Node node : ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer>hm = new HashMap<>();

        hm.put("China", 100);
        hm.put("India", 200);
        hm.put("US", 50);
        //System.out.println(hm);

        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.remove("India"));

        ArrayList<String>set = hm.KeySet();

        for(String k: set){
            System.out.println("Key:"+k +" value:"+hm.get(k));
        }
        System.out.println();


    }
}