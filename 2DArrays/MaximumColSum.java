public class MaximumColSum {

    public static void maximumColSum(){
        int arr2[][]  = {{1,5,4,3}, {4,7,4,3},{8,6,5,8}};

        System.out.println(arr2.length);
        System.out.println(arr2[0].length);

        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

         // maximum Col sum
         int maxsum = 0;
         for(int i=0; i<arr2[0].length; i++){
             int currsum = 0;
             for(int j=0; j<arr2.length; j++){
                 currsum += arr2[j][i];
             }
             maxsum = Integer.max(maxsum, currsum);
         }
         System.out.println("MaxSum:"+maxsum);
    
        }

    public static void main(String[] args) {
        maximumColSum();
    }
}
