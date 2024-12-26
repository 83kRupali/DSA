
public class Patterns {
    public static void squarePattern(int n){
        //colmun
        for(int i=1; i<=n; i++){

            // row
            for(int j=1; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    } 

    public static void squarePatternn(int n){
        //colmun
        for(int i=1; i<=n; i++){
            char ch = 'A';
            // row
            for(int j=1; j<=n; j++){

                System.out.print(ch+" ");
                ch += 1; // 65 + 1 = 66
            }
            System.out.println();
        }
    } 

    public static void squarePatternnn(int n){
        int num = 1; 
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
               System.out.print(num+" ");
               num += 1;
            }
            System.out.println(

            );
        }
    }
    
    public static void squarePatternnnn(int n){
        char num = 'A'; 
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
               System.out.print(num+" ");
               num += 1;
            }
            System.out.println(

            );
        }
    }

    public static void triangelPattern(int n){
        for(int i=0; i<n; i++){  // next line 
            for(int j=0; j<i+1; j++){  //main work
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void triangelPatternn(int n){
        for(int i=0; i<n; i++){  // next line 
            for(int j=0; j<i+1; j++){  //main work
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
     
    public static void triangelPatternnn(int n){
        char ch= 'A';
        for(int i=0; i<n; i++){  // next line 
            
            for(int j=0; j<i+1; j++){  //main work
                System.out.print(ch+" ");
    
            }
            ch += 1;
            System.out.println();
        }
    }

    public static void triangelPatternnnn(int n){
        for(int i=0; i<n; i++){  // next line 
            for(int j=0; j<i+1; j++){  //main work
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
     
    public static void reversetriangleP(int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j>0; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    //Floyd's Triange Pattern
    public static void floydstringleP(int n){
        int num = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    //Inverted Triangle pattern
    public static void invertedtriangle(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            for(int j=0; j<n-i; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    public static void pyramidPattern(int n){
        /*
         * 1) 0 to n
         * 2) 0 to n-i-1 space
         * 2) 0 to n  number print
         * 
         * 1) 0 to i
         * 2) i to 0
         */

         for(int i=0; i<n; i++){
            //spaces : n-i-1

            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            //num1: i+1

            for(int j=1; j<=i+1; j++){
                System.out.print(j);
            }

            // num2 : 

            for(int j=i; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
         }
    }

    //Hollow Diamond Pattern
    public static void hollowDiamondP(int n){
        //top

        for(int i=0; i<n; i++){

            //spaces 
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            System.out.print("*");
            if(i != 0){
                for(int j=0; j<2*i-1; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        //bottom

        for(int i=0; i<n-1; i++){
            //spaces 

            for(int j=0; j<i+1; j++){
                System.out.print(" ");
            }
            System.out.print("*");

            if(i != n-2){

                //spaces

                for(int j=0; j<2*(n-i)-5; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void newPattern(int n){
       
        // top
        for(int i=0; i<n; i++){
            // 1st triangle
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }

            // top space
            for(int j=0; j<2*n-(2*(i+1)); j++){
                System.out.print(" ");
            }
            
            // 2nd triangle
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //bottom
        for(int i=0; i<n; i++){
            // first tringle
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            
            //space 
            for(int j=2; j<2*(i+1); j++){
                System.out.print(" ");
            }

            //second triangle
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

   

  
    public static void main(String[] args) {
        squarePattern(4);
        squarePatternn(4);
        squarePatternnn(3);
        squarePatternnnn(3);
        triangelPattern(4);
        triangelPatternn(4);
        triangelPatternnn(4);
        triangelPatternnnn(4);
        reversetriangleP(4);
        floydstringleP(4);
        invertedtriangle(4);
        pyramidPattern(4);
        hollowDiamondP(4);
        newPattern(4);
    }
}
