import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {
    
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer>map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        List<Map.Entry<Integer, Integer>>list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());

        int ans[] = new int[k];
        int i=0;
        while(i<k){
            ans[i] = list.get(i).getKey();
            i++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,1,2,1,2,3,1,3,2};

        int ans[] = topKFrequent(arr, 2);

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}
