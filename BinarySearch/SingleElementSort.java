
public class SingleElementSort {

    //Single element is sorted Array-540
    //Brute force approach
    //Time Complexity : O(n)

    public static int singleElementSort(){
        //int arr[] = {1,1,2,3,3,4,4,8,8};
        int arr[] = {3,3,7,7,10,11,11};
        int n = arr.length;

        for(int i =1; i<n-1; i++){
            if(arr[i-1] !=arr[i] && arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

    // Optimal approach
    // Time Complexity : O(logn)

    public static int singleElementSort1(){
        //int arr[] = {1,1,2,3,3,4,4,8,8};
        int arr[] = {3,3,7,7,10,11,11};
        int n = arr.length;

        if(n == 1) return arr[0];

        int st  =0;
        int end = n-1;

        while(st <= end){
            int mid = st+ (end - st)/2;

            if(mid == 0 && arr[0]  != arr[1]) 
                return arr[mid]; 

            if(mid == n-1 && arr[n-1] != arr[n-2]) return arr[mid];

            if(arr[mid-1] != arr[mid] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }

            if(mid % 2  == 0){ //even
                if(arr[mid-1] == arr[mid]){   //left
                    end = mid - 1;
                }
                else{    //right
                    st = mid + 1;
                }
            }
            else{  //odd
                if(arr[mid -1] == arr[mid]){    //right
                    st = mid + 1;
                }
                else{   //left
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    
    

    public static void main(String[] args) {
        System.out.println(singleElementSort());
        System.out.println(singleElementSort1());
    }
}
