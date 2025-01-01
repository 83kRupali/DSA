public class Introduction {

    public static void printNum(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }

    // Factorial
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }

        int fact = n * factorial(n-1); 
        return fact; 
    }

    // Sum
    public static int sum(int n){
        if(n == 1){
            return 1;
        }

        int sum = n+sum(n-1);
        return sum; 
    }

    
    public static void main(String[] args) {
        printNum(5);
        System.out.println("Factorial:"+factorial(5));
        System.out.println("Sum:"+sum(4));
    }
}
