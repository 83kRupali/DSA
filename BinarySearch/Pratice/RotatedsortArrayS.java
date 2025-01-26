public class RotatedsortArrayS {

    //3
    public static int rotatedsortArrayS(int arr[], int target){
        int n= arr.length;
        int st = 0; 
        int end = n-1;

        while (st<=end) {
            int mid = st + (end -st)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[st]<=arr[mid]){
                if(target >= arr[st] && target<arr[mid]){
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
            else{

                if(target <= arr[end] && target>arr[mid]){
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    //81

    public static int rotatedsortArraySDouplicate(int arr[], int target){
        int n= arr.length;
        int st = 0; 
        int end = n-1;

        while (st<=end) {
            int mid = st + (end -st)/2;

            if(arr[mid] == target){
                return mid;
            }

            //rempve dupplicatw
            if(arr[st] == arr[mid] && arr[mid] == arr[end]){
                st++;
                end--;
            }

            else if(arr[st]<=arr[mid]){
                if(target >= arr[st] && target<arr[mid]){
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
            else{

                if(target <= arr[end] && target>arr[mid]){
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }


    //153
    public static int minElementRotetedArray(int arr[]){
        // {3,4,5,1,2}  ans-1
        int st = 0;
        int end = arr.length-1;

        int ans = arr[0];

        while (st <= end) {
            int mid = st + (end - st)/2;

            if(arr[st]<=arr[mid]){
                ans = Math.min(ans, arr[st]);
                st = mid+1;
            }
            else{
                ans = Math.min(ans, arr[end]);
                end = mid-1;
            }
        }
        return ans;
    }

    public static int minElementRotetedArrayDuplicate(int arr[]){
        // {3,4,5,1,2}  ans-1
        int st = 0;
        int end = arr.length-1;

        int ans = arr[0];

        while (st <= end) {
            int mid = st + (end - st)/2;

            if(arr[st] == arr[mid] && arr[end]==arr[mid]){
                st++;
                end--;
            }
            else if(arr[st]<=arr[mid]){
                ans = Math.min(ans, arr[st]);
                st = mid+1;
            }
            else{
                ans = Math.min(ans, arr[end]);
                end = mid-1;
            }
        }
        return ans;
    }

    //154
    //find kth rotation
    public static int findkthrotation(int arr[]){
        // {3,4,5,1,2}  ans-1
        int st = 0;
        int end = arr.length-1;

        int minElemet = Integer.MAX_VALUE;
        int idx = Integer.MAX_VALUE;

        while (st <= end) {
            int mid = st + (end - st)/2;

            if(arr[st]<=arr[mid]){
            
                if(arr[st]<minElemet){
                    minElemet = arr[st];
                    idx = st;
                }
                st = mid+1;
            }

            else{
                
                if(arr[mid]<arr[end]){
                    minElemet = arr[mid];
                    idx = mid;
                }
                end = mid-1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        
    }
}
