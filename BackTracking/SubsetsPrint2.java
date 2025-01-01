//package Apna_College.Backtracking;

import java.util.ArrayList;

public class SubsetsPrint2 {

    // Time Complexity : O(2^n*n);
    public static void subsetsPrint(int arr[], ArrayList<Integer>ans, int i){

        if(i == arr.length){
            for(int val : ans){
                System.out.print(val+" ");
            }
            System.out.println();
            return;
        }

        ans.add(arr[i]);
        subsetsPrint(arr, ans, i+1);

        ans.removeLast();

        int idx = i+1;
        while(idx < arr.length && arr[idx] == arr[idx-1]) idx++;

        subsetsPrint(arr, ans, idx);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2};

        subsetsPrint(arr, new ArrayList<>(), 0);
        
    }
}
