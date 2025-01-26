public class InfiniteArray {

    public static int infiniteArray(int arr[], int target){
        int st = 0;
        int end = 1;

        while(arr[end]<=target){
            st = end;
            end = 2 * end;

        }
        System.out.println(st+" "+end);

        while (st<=end) {
            int mid = st+(end-st)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]<target){
                st = mid+1;
            }
            else{
                end = mid + 1;
            }
            
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {2,4,7,9,13,15};
        System.out.println(infiniteArray(arr, 15));
    }
}
