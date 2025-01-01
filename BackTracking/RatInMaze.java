import java.util.ArrayList;

public class RatInMaze {

    // TC: O(4^(n^2));
    // SC: O(n^2)
    public static void ratInMaze(int arr[][], int r, int c, String path, ArrayList<String>ans,boolean vis[][]){
        int n = arr.length;
        if(r<0 || c<0 || r>=n  || c>=n || arr[r][c] == 0 || vis[r][c]){
            return;
        }

        if(r == n-1 && c == n-1){
            ans.add(path);
            return;
        }

        vis[r][c] = true;

        ratInMaze(arr, r+1, c, path+"D", ans, vis);
        ratInMaze(arr, r-1, c, path+"U", ans, vis);
        ratInMaze(arr, r, c-1, path+"L", ans, vis);
        ratInMaze(arr, r, c+1, path+"R", ans, vis);

        vis[r][c] = false;
    }

    // TC: O(4^(n^2));
    // SC: reduce the space complexity

    public static void ratInMaze1(int arr[][], int r, int c, String path, ArrayList<String>ans){
        int n = arr.length;
        if(r<0 || c<0 || r>=n  || c>=n || arr[r][c] == 0){
            return;
        }

        if(r == n-1 && c == n-1){
            ans.add(path);
            return;
        }

        arr[r][c] = -1;

        ratInMaze1(arr, r+1, c, path+"D", ans);
        ratInMaze1(arr, r-1, c, path+"U", ans);
        ratInMaze1(arr, r, c-1, path+"L", ans);
        ratInMaze1(arr, r, c+1, path+"R", ans);

        arr[r][c] = 1;
    }
    public static void main(String[] args) {
        int n = 4;
        int arr[][] = {
            {1,0,0,0},
            {1,1,0,1},
            {1,1,0,0},
            {0,1,1,1}
        };
    
        ArrayList<String>ans = new ArrayList<>();

        boolean vis[][] = new boolean[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                vis[i][j] = false;
            }
        }

        String path = ""; 
        ratInMaze(arr, 0, 0, path ,ans, vis);

        for(String str : ans){
            System.out.println(str);
        }
        System.out.println("Second>...................");
        ratInMaze1(arr, 0, n, path, ans);
        for(String str : ans){
            System.out.println(str);
        }
        System.out.println();
    }

}
