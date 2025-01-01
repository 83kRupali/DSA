//package Apna_College.HashingProblem;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    //LeetCode : 1
    //Brute force approach
    //Time Complexity: O(n^2)

    public static void twoSum(){
        int arr[] = {5,2,11,7,15};
        int target = 20;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(i+ " " +j);
                    return ;
                }
            }
        }
    }

    //Better force approach
    // 2 pointers
    //Time Complexity: O(nlog(n))+O(n) => O(nlog(n))

    public static void twoSum1(){
        int arr[] = {5,2,11,7,15};
        int target = 9;

        Arrays.sort(arr);
        //{2,5,7,11,15}

        int st = 0, end = arr.length-1;

        while(st<=end){
            int sum = arr[st]+arr[end];
            if(sum == target){
                System.out.println(st+" "+end);
                return;
            }
            else if(sum < target){
                st++;
            }
            else{
                end--;
            }
        }
    }

    //Brute force approach
    //Time Complexity: O(n^2)

    public static void twoSum2(){
        int arr[] = {5,2,11,7,15};
        int target = 20;

        //key , value
        HashMap<Integer, Integer>map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int first = arr[i];
            int second = target - first;

            if(map.containsKey(second)){
                System.out.println(map.get(second)+" "+i);
            }
            else{
                map.put(arr[i], i);
            }
        }

    }
    public static void main(String[] args) {
        twoSum();
        twoSum1();
        twoSum2();
    }
}
