//package Apna_College.HashingProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sum3 {

    //Time Complexity: O(n^3)
    public static void sum3(){
        int arr[] = {-1,0,1,2,-1,-4};

        Arrays.sort(arr);
        //HashSet<ArrayList<Integer>>set = new HashSet<>();

        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if((arr[i]+arr[j]+arr[k]) == 0){
                        //set.add(arr[i]+" "+arr[j]+" "+arr[k]);
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }

    //Time complexity: O(n^2)
    // leet code :15
    //Time complexity: O(n^2 * log(uniqueTriplet))

    public static void sum32(){
        int nums[] = {-1,0,1,2,-1,-4};
        int n = nums.length;
        Arrays.sort(nums);
        int target = 0;

        // HashSet<Integer>set = new HashSet<>();

        // for(int i=0; i<n; i++){
        //     int target = -arr[i];
        //     for(int j=i+1; j<n; j++){
        //         int toFind = target - arr[j];

        //         if(set.contains(toFind)){
        //             System.out.println(arr[i]+" "+arr[j]+" "+toFind);

        //         }
        //         else{
        //             set.add(arr[j]);
        //         }
        //     }
        // }

        for (int i = 0; i < n; i++) {
            int tar = target - nums[i];

            Set<Integer> s = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int third = tar - nums[j];

                if (s.contains(third)) {
                   System.out.println(nums[i]+" "+nums[j]+" "+third);
                }
                s.add(nums[j]);
            }
        }
    }

    // 2 Pointer Approach

    //TC:O(nlogn+n^2)

    public static void sum33(){
        int arr[] = {-1,0,1,2,-1,-4};
        int n = arr.length;
        Arrays.sort(arr);
        System.err.println("sum33");

        for(int i=0; i<n; i++){

            // avoid duplicate arr[i]
            // TC: O(nlogn) + O(n^2); ===>  O(nlogn + n^2)

            if(i>0 && arr[i] == arr[i-1]) continue;

            int j=i+1, k=n-1;

            while(j < k){
                int sum = arr[i]+arr[j]+arr[k];

                if(sum<0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    j++;k--;

                    // to avoid duplicate arr[j]
                    while (j<k && arr[j] == arr[j-1]) {
                        j++;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        sum3();
        System.out.println("..............");
        sum32();
        System.out.println("..............");
        sum33();

    }
}
