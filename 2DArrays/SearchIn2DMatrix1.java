public class SearchIn2DMatrix1 {

    /*
       Search a 2D Matrix

     * 1) Each row is sorted in non-decreasing order.
     * 
     * 2) The first integer of each row is greater than the last integer of the previous row.
     * 
     * 
     * Time Complexity : O(log(m*n));
     */

     public static boolean searchInRow(int arr[][], int target, int row){
        int n = arr[0].length;  //column
        int st = 0,  end = n-1;

        while (st <= end) {
            int mid = st + (end - st)/2;

            if(target == arr[row][mid]){
                return true;
            }
            else if(target > arr[row][mid]){
                st = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }

    public static boolean searchIn2DMatrix(){
        int arr[][] ={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };

        //int target = 31;
        int target = 34;

        int m = arr.length;       // Row
        int n = arr[0].length;    // Column

        int startRow = 0,   endRow = m-1;

        while (startRow <= endRow) {
            int midRow = startRow + (endRow-startRow)/2;
            
            if(target >= arr[midRow][0] && target <= arr[midRow][n-1]){
                return searchInRow(arr, target, midRow);
            }

            else if(target >= arr[midRow][n-1]){
                //down => right
                startRow = midRow + 1;
            }
            else{
                //up => left
                endRow = midRow - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(searchIn2DMatrix());
    }
}
