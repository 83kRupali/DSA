//package Apna_College.HashingProblem;

import java.util.HashSet;

public class DuplicateFind {

    //Time complexity : O(n)
    //space Complexity: O(n)
    public static void duplicateFind(){
        int arr[] = {3,1,3,4,2};
        HashSet<Integer>set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
    }

    //leetcode:287

    //Time Complexity:O(n)
    //space complexity:O(1)

    public static void duplicateFind1(){
        int arr[] = {3,1,3,4,2};
        
        int slow = 0;
        int fast = 0;

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);

        slow = 0;
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        System.out.println(slow);
        System.out.println(fast);
    }


    public static void main(String[] args) {
        duplicateFind();
        duplicateFind1();
    }
}
