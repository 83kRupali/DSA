import java.util.HashMap;
import java.util.TreeMap;

public class TreeMape {
    public static void main(String[] args) {

        // sorted, redBlacked Tree use
        TreeMap<String, Integer> lhm = new TreeMap<>();
        
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);
        lhm.put("Asia", 50);
        System.out.println(lhm);

        HashMap<String, Integer> hm = new HashMap<>();
        
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Asia", 50);
        System.out.println(hm); 
    }
}
