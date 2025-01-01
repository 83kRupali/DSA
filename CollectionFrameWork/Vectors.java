//package Apna_College.STL;
import java.util.Vector;
import java.util.Iterator;

public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> vect = new Vector();
        System.out.println(vect.capacity());
        vect.add(10);
        vect.add(20);
        vect.add(30);
        vect.add(40);
        vect.add(50);
        System.out.println(vect.size());
        System.out.println(vect);
        for(int i=0; i<vect.size(); i++){
            System.out.print(vect.get(i)+" ");
        }
        System.out.println();
        vect.remove(0);
        for(int i=0; i<vect.size(); i++){
            System.out.print(vect.get(i)+" ");
        }
        System.out.println();
        System.out.println(vect.getFirst());
        vect.add(3, 70);

        for(int i=0; i<vect.size(); i++){
            System.out.print(vect.get(i)+" ");
        }
        System.out.println();
        
        for(int i:vect){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Iterator........");
        // Declare and initialize an iterator

        Iterator<Integer> it = vect.iterator();

        // Iterate through the Vector using the iterator
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        for(int i:vect){
            System.out.print(i+" ");
        }  
        System.out.println();
        vect.clear();
        for(int i:vect){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(vect.size());
        System.out.println(vect.capacity());

        
        
        
    }
}
