import java.util.LinkedHashSet;

public class LinkedHashSett {
    public static void main(String[] args) {
         LinkedHashSet<Integer>set = new LinkedHashSet();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(1);

        System.out.println(set);
        System.out.println(set.isEmpty());

        if(set.contains(2)){
            System.out.println("set contains 2.......");
        }

        if(set.contains(3)){
            System.out.println("set contains 3.......");
        }

        System.out.println(set.size());
        set.remove(2);
        if(set.contains(2)){
            System.out.println("set contains 2.......");
        }
        System.out.println(set.size());
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }   
    }   
