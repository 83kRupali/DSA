public class LinearSearch {
    public static void linearSearch(){
        int arr2[][]  = {{1,5,4,3}, {4,7,4,3},{8,6,5,8}};

        System.out.println(arr2.length);
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
    }
public static void main(String[] args) {
    linearSearch();
}
}
