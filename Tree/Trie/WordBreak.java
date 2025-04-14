package Trie;

public class WordBreak {

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

    public static boolean search(String key){
        Node node = root;

        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i)-'a';

            if(node.children[idx] == null){
                return false;
            }

            if(idx == key.length()-1 && node.children[idx].eow == false){
                return false;
            }

            node = node.children[idx];
        }
        return true;
    }

    public static boolean wordBreak(String key){
        if(key.length() == 0) return true;

        for(int i=1; i<=key.length(); i++){
            String firstpart = key.substring(0, i);
            String secondPart = key.substring(i);

            if(search(firstpart) && wordBreak(secondPart)){
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        String words[] = {"i", "like", "sam", "samsung", "mobile"};

        String key = "ilikesamsung";       //i, like, samsung ---> true

        String key1 = "ilikesam";       //i, like, sam ---> true

        String key2 = "ilikesung";       //i, like, sung ---> false

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(wordBreak(key));
        System.out.println(wordBreak(key2));
        System.out.println(wordBreak(key1));
    }
}
