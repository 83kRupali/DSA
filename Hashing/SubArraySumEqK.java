import java.util.HashMap;

public class SubArraySumEqK {

    // Time Complexity : O(n)

    public static int subArraySumEqK(int arr[], int k){
        int n = arr.length;

        HashMap<Integer, Integer>map = new HashMap<>();

        int ans = 0;
        int sum  = 0;
        map.put(0, 1);

        for(int i=0; i<n; i++){
            sum += arr[i];

            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
                
            }

            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int k1  = 3;
        
        int arr2[] = {10, 2,-2, -20,10};
        int k2 = -10;

        System.out.println(subArraySumEqK(arr1, k1));
        System.out.println(subArraySumEqK(arr2, k2));

    }
}
