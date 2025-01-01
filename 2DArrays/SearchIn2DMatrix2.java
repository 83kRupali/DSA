public class SearchIn2DMatrix2 {

    /*
     * Search in Matrix
     * 
     * 1) Integer in each row are sorted in ascending from left to right.
     * 
     * 2) Integers in each column are sorted in ascending from top to bottom.
     * 
     * 
     * TimeComplexity:O(n+m)
     */

    public static boolean searchIn2DMatrix2(){
        int arr[][] ={
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30},
        };

        int target = 50;

        int m = arr.length;
        int n = arr[0].length;

        int r = 0,   c = n-1;

        while(r<m && c>=0){
            if(target == arr[r][c]){
                return true;
            }
            else if(target < arr[r][c]){
                c--;
            }
            else{
                r++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(searchIn2DMatrix2());
    }
}
