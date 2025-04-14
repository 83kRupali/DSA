package Trie;

public class LongestWordPrefix {
    
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

    public static String ans = "";
    public static void longestWordPrefix(Node root, StringBuilder str){
        if(root == null) return;

        for(int i=0; i<26; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                str.append((char)(i+'a'));

                if(str.length() > ans.length()){
                    ans = str.toString();
                }

                longestWordPrefix(root.children[i], str);

                str.deleteCharAt(str.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        longestWordPrefix(root, new StringBuilder(""));

        System.out.println(ans);   //apple
    }
}
