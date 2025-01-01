//package Apna_College.Backtracking;

import java.util.ArrayList;

public class SubsetsPrint1 {

    //Leetcode:78
    //TC:O(2^n*n)
    public static void subsetsPrint(int arr[], ArrayList<Integer>ans, int i){   // ans is pass by referance

        if( i == arr.length){
            for(int val : ans){
                System.out.print(val);
            }
            System.out.println();
            return;
        }

        //its includes
        ans.addLast(arr[i]);
        subsetsPrint(arr, ans, i+1);

        //backtracking
        ans.removeLast();

        //its exclude
        subsetsPrint(arr, ans, i+1);
    }

    public static void subsetsPrint1(int arr[], ArrayList<Integer>ans, int i){   // ans is pass by referance

        if( i == arr.length){
            return;
        }

        //its includes
        ans.addLast(arr[i]);
        subsetsPrint(arr, ans, i+1);

        //backtracking
        ans.removeLast();

        //its exclude
        subsetsPrint(arr, ans, i+1);
    }

    public static void subsetsPrint2(int arr[], ArrayList<Integer>ans, int i,ArrayList<ArrayList<Integer>>allsubsets){   // ans is pass by referance

        if( i == arr.length){
            allsubsets.add(new ArrayList<>(ans));
            return;
        }

        //its includes
        ans.addLast(arr[i]);
        subsetsPrint2(arr, ans, i+1,allsubsets);

        //backtracking
        ans.removeLast();

        //its exclude
        subsetsPrint2(arr, ans, i+1,allsubsets);
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3};

        ArrayList<Integer>ans = new ArrayList<>();
        //subsetsPrint(arr, ans, 0);
        // subsetsPrint1(arr, ans, 0);

        // for(int v : ans){
        //     System.out.print(v+" ");
        // }
        // System.out.println();
        ArrayList<ArrayList<Integer>>allsubsets = new ArrayList<>();
        subsetsPrint2(arr, ans, 0, allsubsets);

        for (ArrayList<Integer> innerList : allsubsets) {
            for (Integer num : innerList) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
