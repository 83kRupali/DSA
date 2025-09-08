import java.util.HashMap;

public class LargestSubArraySum0 {

    public static int largestSubArraySum0(int arr[]){
        HashMap<Integer, Integer>map = new HashMap<>();

        int sum  = 0;
        int len = 0;

        for(int j=0; j<arr.length; j++){
            sum += arr[j];

            if(map.containsKey(sum)){
                len = Math.max(len, j-map.get(sum));
            }
            else{
                map.put(sum, j);
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int arr1[] = {15,-2,2,-8,1,7,10,23};   //ans = 5

        int arr2[] = {3,4,5};  // ans = 0;

        System.out.println(largestSubArraySum0(arr1));
        
        
    }
}
