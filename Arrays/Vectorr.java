//package Apna_College.Arrays;

import java.util.Vector;

public class Vectorr {

    // single number - 136

    public static void singleNumber(Vector<Integer>vec){
        int ans = 0;
        
        // for(int i=0; i<vec.size();  i++){
        //     ans = ans ^ vec.get(i);
        // }
        // System.out.println(ans);

        for(int v:vec){
            ans = ans ^ v;
        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        Vector<Integer>vect = new Vector<>();
        vect.add(10);
        vect.add(20);
        vect.add(20);
        vect.add(40);
        vect.add(30);
        vect.add(60);
        vect.add(60);

        for(int i=0; i<vect.size(); i++){
            System.out.print(vect.get(i)+" ");
        }
        System.out.println();
        System.out.println(vect.size());
        int pop = vect.remove(2);
        for(int i=0; i<vect.size(); i++){
            System.out.print(vect.get(i)+" ");
        }
        System.out.println();
        System.out.println(vect.size());
        singleNumber(vect);


    }
}
