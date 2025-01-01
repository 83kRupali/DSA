public class KnightsTour {

    public static boolean knightsTour(int grid[][], int r, int c, int n, int expVal){
        if(r<0 || c<0 || r>=n || c>= n || grid[r][c] != expVal){
            return false;
        }

        if(expVal == n*n-1) return true;

        boolean ans1 = knightsTour(grid, r-2, c+1, n, expVal+1);
        boolean ans2 = knightsTour(grid, r-1, c+2, n, expVal+1);
        boolean ans3 = knightsTour(grid, r+1, c+2, n, expVal+1);
        boolean ans4 = knightsTour(grid, r+2, c+1, n, expVal+1);
        boolean ans5 = knightsTour(grid, r+2, c-1, n, expVal+1);
        boolean ans6 = knightsTour(grid, r+1, c-2, n, expVal+1);
        boolean ans7 = knightsTour(grid, r-1, c-2, n, expVal+1);        
        boolean ans8 = knightsTour(grid, r-2, c-1, n, expVal+1);

        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;
    }
    public static void main(String[] args) {
        int arr[][] = {
            {0,3,6},
            {5,8,1},
            {2,7,4},
        };

        System.out.println(knightsTour(arr, 0, 0, arr.length, 0));
    }
}
