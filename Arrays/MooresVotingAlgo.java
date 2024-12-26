import java.util.ArrayList;
import java.util.Arrays;

public class MooresVotingAlgo {

    //Pair Sum 
    //Brute Force Approach
    // Time Complexity: O(n^2)
    public static void pairSum(){
        int arr[] ={2,7,11,13};

        int target = 18;

        int n  = arr.length;
        ArrayList<Integer>ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    ans.add(i);
                    ans.add(j);
                }
            }
        }

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }

    //Pair Sum 
    //Opitimized Approach
    // Time Complexity: O(n)
    public static void pairSum1(){
        int arr[] ={2,7,11,13};

        int target = 18;

        int n  = arr.length;
        ArrayList<Integer>ans = new ArrayList<>();

        int i =0; 
        int j =n-1;

        while(i<j){
            int pairSum = arr[i]+arr[j];
            if(pairSum < target){
                i++;
            }
            else if(pairSum > target){
                j--;
            }
            else{
                ans.add(i);
                ans.add(j);
                break;
            }
        }

        for(int k=0; k<ans.size(); k++){
            System.out.print(ans.get(k)+" ");
        }
        System.out.println();
    }

    // Mojarity Element-169
    //BruteForce Approach
    // Time Complexity: O(n^2)
    public static void mojarityElement(){
        int arr[] = {1,1,2,2,2,2};
        int n = 6;

        int ans = 0;
        for(int val:arr){
            int freq = 0;

            for(int el:arr){
                if(val == el){
                    freq++; 
                }
            }
            if(freq>n/2){
                ans = val;
            }
        }
       System.out.println("Mojarity Element:"+ans);
    } 

    // Mojarity Element-169
    //Optimized Approach
    // Time Complexity: O(nlogn)+O(n) == O(nlog(n))

    public static void mojarityElement1(){
        int arr[] = {1,1,2,1,2};
        int n = 5;

        Arrays.sort(arr);  // O(nlogn)
        int freq = 1; 
        int ans = arr[0];

        for(int i=1; i<n; i++){  //O(n)
            if(arr[i] == arr[i-1]){
                freq++;
            }
            else{
                freq = 1; 
                ans = arr[i];
            }
            if(freq > n/2){
                System.out.println("Mojarity Element:"+ans);
            }
        }
    } 

    // Moore's voting Approach
    // Mojarity Element-169
    //more Optimized Approach
    // Time Complexity: o(n)
    
    public static void mojarityElement2(){
        int arr[] = {1,1,2,2,2,3,3,2,2};
        int n = 9;

       int freq = 0;
       int ans = 0;

        for(int i=0; i<n; i++){  //O(n)
            if(freq == 0){
                ans = arr[i];
            }
            if(ans == arr[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
        System.out.println("Mojarity Element:"+ans);
    } 

    public static void mojarityElement3(){
        int arr[] = {1,1,2,2,2,3,3,2,2};
        int n = 9;

       int freq = 0;
       int ans = 0;

        for(int i=0; i<n; i++){  //O(n)
            if(freq == 0){
                ans = arr[i];
            }
            if(ans == arr[i]){
                freq++;
            }
            else{
                freq--;
            }
        }

        int count = 0; 
        for(int val : arr){
            if(val == ans){
                count++;
            }
        }
        if(count > n/2){
            System.out.println("Mojarity Element:"+ans);
        }
        else{
            System.out.println("Not Mojarity Element -1");
        }
    } 
    public static void main(String[] args) {
        pairSum();
        pairSum1();
        mojarityElement();
        mojarityElement1();
        mojarityElement2();
        mojarityElement3();
    }
}
