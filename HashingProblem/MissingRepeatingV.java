//package Apna_College.HashingProblem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MissingRepeatingV {

    //leetcode : 2965
    //Time Complexity: O(n^2)
    
    public static void missingRepeatingV(){
        int arr[][] = {
            {9,1,7},
            {8,9,2},
            {3,4,6}
        };

        HashSet<Integer> map = new HashSet<>();

        int repeat = 0;
        int sum =0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                sum += arr[i][j];
                if(map.contains(arr[i][j])){
                    repeat = arr[i][j];
                }
                else{
                    map.add(arr[i][j]);
                }
            }
        }

        // This is imp for the coding platform
        // int expect = n * n * (n * n + 1) / 2;

        // mis  = repeat - (sum - expect);

        //expectSum = (n*n) * (n*n+1)/2
        int sumAll = 0;
        for(int i=1; i<=9; i++){
            sumAll += i;
        }

        int mis = sumAll - sum;
        System.out.println("Missing:"+Math.abs(mis));
        System.out.println("Repeatingg:"+repeat);
    }


    public static void main(String[] args) {
        missingRepeatingV();
    }
}
