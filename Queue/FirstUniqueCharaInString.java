import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueCharaInString {

    public static int firstUniqueCharaInString(String str){
        
        HashMap<Character, Integer>map = new HashMap<>();
        Queue<Integer>q = new LinkedList<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(!map.containsKey(ch)){
                q.add(i);
            }

            map.put(ch, map.getOrDefault(ch,0)+1);

            while(!q.isEmpty() && map.get(str.charAt(q.peek()))>1){
                q.remove();
            }
            
        }

        if(q.isEmpty()){
            return -1;
        }
        return q.peek();
    }
    public static void main(String[] args) {
        String str = "level";
        System.out.println(firstUniqueCharaInString(str));

        String str1 = "lleet";
        System.out.println(firstUniqueCharaInString(str1));
    }
}