import java.util.HashSet;
import java.util.Iterator;

public class IterationHashSet {
    public static void main(String[] args) {
        HashSet<String>cities = new HashSet<>();
        
        cities.add("pune");
        cities.add("chandrapur");
        cities.add("noida");
        cities.add("mumbai");
        cities.add("pune");
        cities.add("chandrapur");

        System.out.println("Iterator............");
        Iterator it = cities.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
            
        }


        System.out.println("for loop............");
        for(String city : cities){
            System.out.println(city);
        }
    }
}
