public class DiagonalSum {

    //time Complexity : O(n^2)
    public static void diagonalSum(){
        int arr[][] ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // 1+5+9 = 15  3+5+7 = 15   15+15-5 = 25;
        
        int arr1[][] ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        //1+6+11+16= 34
        //4+7+10+13= 34    
        //34+34= 68

        int diagonalsum = 0;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                if(i==j){
                    diagonalsum += arr1[i][j];
                }
                else if(j == arr1.length-i-1){
                    diagonalsum += arr1[i][j];
                }
            }
        }
        System.out.println("Diagonalsum:"+diagonalsum);
    }

    //time complexity : O(n)
    public static void diagonalSum1(){
        int arr[][] ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // 1+5+9 = 15  3+5+7 = 15   15+15-5 = 25;
        
        int arr1[][] ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        //1+6+11+16= 34
        //4+7+10+13= 34    
        //34+34= 68

        int diagonalsum = 0;
        for(int i=0; i<arr1.length; i++){
            diagonalsum +=arr1[i][i];

            if(i != arr1.length - i- 1){
                diagonalsum += arr1[i][arr1.length - i- 1];
            }
        }
        System.out.println("Diagonalsum:"+diagonalsum);
    }
    public static void main(String[] args) {
        diagonalSum();
        diagonalSum1();
    }
}
