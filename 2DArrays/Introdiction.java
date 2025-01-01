public class Introdiction {
    public static void main(String[] args) {
        int n = 2;   //row
        int m = 2;   //columns
        int arr[][] ={{1,2},{4,3}};

        int arr1[][] = new int[n][m];
        
        arr1[0][0]  = 2;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        int arr2[][]  = {{1,5,4,3}, {4,7,4,3},{8,6,5,8}};

        System.out.println(arr2.length);

        // how many element in row 
        System.out.println(arr2[0].length);

        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        int target = 6;
        
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                if(arr2[i][j]==target){
                    System.out.println(i+" "+j);
                    System.out.println("Found...");
                }
            }
        }

        // maximum Row sum
        int maxsum = 0;
        for(int i=0; i<arr2.length; i++){
            int currsum = 0;
            for(int j=0; j<arr2[0].length; j++){
                currsum += arr2[i][j];
                maxsum = Integer.max(maxsum, currsum);
            }
        }
        System.out.println("MaxSum:"+maxsum);
    }
}
