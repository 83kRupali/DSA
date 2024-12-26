//package Apna_College.Strings;


/*

Character Arrays
   char str[] = {'a','b','c','d'};

 * # Strings #
 * 
 * "College"
 * 
 */

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        char[]str = {'a','b','c','d'};

        for(char i : str){
           System.out.print(i+" ");
        }
        System.out.println();

        for(int i=0; i<str.length; i++){
            System.out.print(str[i]+" ");
        }
        System.out.println();
        System.out.println(str);
        String str1 = "rupali";
        String str2 = "ramteke";
        System.out.println(str1);
        System.out.println("Concate:"+str1+str2);

        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println(name);
        System.out.println();
        System.out.println();
        String name1 = sc.nextLine();
        System.out.println(name1);


    }
}
