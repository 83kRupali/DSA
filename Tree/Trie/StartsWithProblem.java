package Trie;

public class StartsWithProblem {
    static class Node {
    
        Node children[];
        //end of word
        boolean eow;

        public Node(){
            children = new Node[26];
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';

            // add new node
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            if(i == word.length()-1){
                curr.children[idx].eow = true;
            }

            curr = curr.children[idx];
        }
    }

    public static boolean startsWithProblem(String prefix){

        Node node = root;
        for(int i=0; i<prefix.length(); i++){
            int idx  = prefix.charAt(i)-'a';

            if(node.children[idx] == null) return false;

            node = node.children[idx];
        }

        return true;
    }

    public static void main(String[] args) {
        String words[] = {"apple", "app", "mango", "man", "woman"};
        String prefix = "app";
        String prefix1 = "rutu";

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(startsWithProblem(prefix));
        System.out.println(startsWithProblem(prefix1));
    }
}
