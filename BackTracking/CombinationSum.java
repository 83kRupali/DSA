import java.util.ArrayList;
import java.util.HashSet;

public class CombinationSum {

    // leetcode 39

    public static HashSet<ArrayList<Integer>>set = new HashSet<>();

    public static void combinationSum(int arr[], int idx, int target, ArrayList<Integer>combin, ArrayList<ArrayList<Integer>>ans){

        if(idx == arr.length || target < 0){
            return;
        }

        if(target == 0){
            if(!set.contains(combin)){
                ans.add(new ArrayList<>(combin));
                set.add(combin);
                return;
            }   
        }
        
        combin.add(arr[idx]);
        combinationSum(arr, idx+1, target-arr[idx], combin, ans);

        combinationSum(arr, idx, target-arr[idx], combin, ans);

        combin.removeLast();
        combinationSum(arr, idx+1, target, combin, ans);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5};
        int target = 8;
        ArrayList<ArrayList<Integer>>ans = new ArrayList<>();

        ArrayList<Integer>combin = new ArrayList<>();
        combinationSum(arr, 0, target, combin, ans);

        for(ArrayList<Integer> combin1:ans){
            for(Integer num:combin1){
                System.err.print(num);
            }
            System.out.println();
        }
    }
}
