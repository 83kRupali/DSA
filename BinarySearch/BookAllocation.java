
public class BookAllocation {

    
    /*   BOOK ALLOCATION PROBLEM

     * There are N books, each ith book has A[i] number of pages.
     * you  have to allocate books to M number of students so that the maximum number of pages allocate to a students is minimum.
     * 
     * * Each book should be allocated to a student.
     * * Each student has to be allocated  at least one book.
     * * Allotment should be in contiguous order.
     * 
     * Calculate and return that minimum possible number.
     * 
     * Return -1 if a valid assignment is not possible. 
     */


    // Time complexity : O(logN + n)
    public static int bookAllocation(){
        int arr[] = {2,1,3,4};
        int n = 4, m = 2;             //6
        // int arr[] = {15,17,20};    //ans = 32
        // int n = 3, m = 2;
        int sum = 0;

        if(m>n){
            return -1;
        }

        for(int i=0; i<n; i++){   //log(n)
            sum += arr[i];
        }

        int st = 0, end = sum;   //range of possible ans
        int ans = -1; 

        while(st <= end){    
            int mid = st+(end-st)/2;

            if(isValid(arr,n, m, mid)){   //left
                ans = mid;
                end = mid-1;
            }
            else{   //right
                st = mid+1;   
            }
        }
        return ans;
    }

    public static boolean isValid(int arr[], int n, int m, int maxAllowedPages){//O(logn)
        //mid ---> maxAllowedPages
        int student = 1, pages = 0;

        for(int i=0; i<n; i++){
            if(arr[i] > maxAllowedPages){
                return false;
            }

            if(pages + arr[i]<=maxAllowedPages){
                pages += arr[i];
            }
            else{
                student++;
                pages  = arr[i];
            }
        }

        return student > m ? false : true;
    }

    public static void main(String[] args) {
        System.out.println(bookAllocation());
    }
}