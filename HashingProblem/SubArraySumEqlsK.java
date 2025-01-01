//package Apna_College.HashingProblem;

import java.util.HashMap;

public class SubArraySumEqlsK {

    //leetcode : 560
    // TC: O(n^2)
    public static void subArraySumEqlsK(){
        int arr[] = {9,4,20,3,10,5};
        int n = arr.length;

        int target = 33;
        int count = 0;

        for(int i=0; i<n; i++){
            int sum =0;
            for(int j=i; j<n; j++){
                sum += arr[j];

                if(sum == target){
                    count++;
                }
            }
        }
        System.out.println("Count:"+count);
    }


    //TC: O(n)
    //SC: O(n) 
    public static void subArraySumEqlsK1(){
        int arr[] = {9,4,20,3,10,5};
        int n = arr.length;

        int target = 33;
        int count = 0;

       
        int prefixSum[] = new int[n];
        
        prefixSum[0] = arr[0];  
        for(int i=1; i<n; i++){
            prefixSum[i] = prefixSum[i-1]+arr[i];
        }

        HashMap<Integer, Integer>map = new HashMap<>();

        for(int j=0; j<n; j++){
            if(prefixSum[j] == target){
                count++;
            }

            int val = prefixSum[j]  - target;
            if(map.containsKey(val)){
                count += map.get(val);
            }
            
            if(map.containsKey(prefixSum[j])){
                map.put(prefixSum[j], map.get(prefixSum[j])+1);
            }
            else{
                map.put(prefixSum[j], 1);
            }
        }

        System.out.println("Count:"+count);
    }
    public static void main(String[] args) {
        subArraySumEqlsK();
        subArraySumEqlsK1();
    }
}
