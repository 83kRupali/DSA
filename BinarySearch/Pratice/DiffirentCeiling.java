public class DiffirentCeiling {

    //744
    public static char diffirentCeiling(Character arr[], char target){
        char ans = arr[0];
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] <= target){
                start = mid + 1;
            }
            else{
                end = mid-1;
                ans = arr[mid];
            }
        }
        return ans;
    }

    public static char diffirentFloor(Character arr[], char target){
        char ans = '$';
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] >= target){
                end = mid-1;
                
               // start = mid + 1;
            }
            else{
                start = mid + 1;
                // end = mid-1;
                ans = arr[mid];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Character arr[] = {'a','b','c','d','e','r'};
        System.out.println(diffirentCeiling(arr, 'e'));
        System.out.println(diffirentFloor(arr, 'e'));
    }
}











