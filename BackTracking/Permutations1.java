import java.util.ArrayList;
import java.util.Arrays;

public class Permutations1 {

    //leetcode : 46
    //TC: O(n!*n)
    //SC:O(n!)

    public static void permutations(int arr[], int idx){
        if(idx == arr.length-1){
            for(int i=0;  i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }

        for(int i=idx; i<arr.length; i++){
            swap(arr,idx,i);
            permutations(arr, idx+1);
            swap(arr,idx,i);;
        }
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void permutations1(ArrayList<Integer>arr, int idx, ArrayList<ArrayList<Integer>>ans){
        if(idx == arr.size()-1){
            ans.add(new ArrayList<>(arr));
            return;
        }

        for(int i=idx; i<arr.size(); i++){
            swap1(arr,idx,i);
            permutations1(arr, idx+1, ans);
            swap1(arr,idx,i);;
        }
    }

    public static void swap1(ArrayList<Integer>arr, int i, int j){
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
    public static void main(String[] args) {
        int arr[]  = {1,2,3};
        permutations(arr, 0);
        System.out.println("Permutations.................");

        ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
       // ArrayList<Integer>nums= new ArrayList<>(Arrays.asList(1,2,3));
       ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));

       permutations1(nums, 0, ans);

        for(ArrayList<Integer> num : ans){
            for(Integer n : num){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
