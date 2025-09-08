import java.util.HashMap;
import java.util.Set;

public class MajorityElement {

    //Time complexity : O(n)

    public static void majorityElement(int arr[]){
        int n = arr.length;

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=0; i<n; i++){
            int num = arr[i];

            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }

            //map.put(arr[i] , map.getOrDefault(arr[i], 0)+1)
        }

       // Set<Integer>keyset = map.keySet();

        for(Integer key: map.keySet()){
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,3,2,5,1,3,1,5,1};
        int arr2[] = {1,2};
        majorityElement(arr1);
        majorityElement(arr2);
    }
}
