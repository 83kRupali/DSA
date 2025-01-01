import java.util.ArrayList;

public class SpiralMatrix {

    /*
     * Spiral Matrix
     * 
     * Time Complexity:O(m*n)
     * 
     */
    public static void spiralMatrix(){

        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        int m = arr.length;
        int n = arr[0].length;

        ArrayList<Integer>ans = new ArrayList<>();

        int srow = 0,  erow = m-1;
        int scol = 0,  ecol = n-1;

        while(srow<=erow && scol <= ecol){

            //top
            for(int j=scol; j<=ecol; j++){
                ans.add(arr[srow][j]);
            }

            //right

            for(int i=srow+1; i<=erow; i++){
                ans.add(arr[i][ecol]);
            }

            //bottom

            for(int j=ecol-1; j>=scol; j--){
                if(srow==erow){
                    break;
                }
                ans.add(arr[erow][j]);
            }

            for(int i=erow-1; i>=srow+1; i--){
                if(scol == ecol){
                    break;
                }
                ans.add(arr[i][scol]);
            }

            srow++;erow--;scol++; ecol--;
        }

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        spiralMatrix();
    }
}