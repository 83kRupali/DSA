/*
 * Conditional Statements
 * 
 * 1) if - else
 * 
 * 2) if - else if - else
 * 
 * 3) 
 * 
 * Ternary Statement
 * 
 * condition ? stt1 : stt2;
 * 
 * 
 * #LOOPS
 * 
 * 1) while loop
 *   
 * infinite loop -->terminate condition  --   false
 * 
 * 
 * 2) for loop
 * for(initialisation; condition; updation){
 *    // work
 * }
 * 
 * #break , continue, keyword
 * 
 * problem: Sum of all odd number from 1 to N
 * 
 * 
 * 3) do while loop
 *   do{
 *      //statement
 *   }(condition);
 * 
 * 
 * problem : cheak if a number is prime or not.
 * 
 * 
 * #Nested Loops
 * Loop inside loop
 * 
 * problem : Sum of all numbers from 1 to N which are divisible by 3. 
 * 
 * print factorial of a number N.
 */

public class ConditionalAndLoops {
   public static void main(String[] args) {
    int age = 18;
    boolean ans = (age<18) ? true:false;
    System.out.println(ans);

    int n = 7;
    boolean isprime = false;
    for(int i=2; i*i<=n; i++){
        if(n%i==0){
           isprime = true;
           break;
        }
    }
    if(isprime){
        System.out.println("Not prime number");
    }
    else{
        System.out.println("prime number");
    }
   } 
}
