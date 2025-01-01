//package Apna_College.STL;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer>ss = new Stack();
        ss.add(10);
        ss.add(20);
        ss.add(30);
        ss.add(40);
        ss.add(50);
        System.out.println(ss);
        for(int i:ss){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(ss.pop());
        for(int i:ss){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
}
