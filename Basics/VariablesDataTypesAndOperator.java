/*
  # Variable
    containers to store data.

    DataTypes

    byte - 1bytes
    short - 2bytes
    int - 4 bytes
    long - 8 bytes
    char - 2 bytes
    float  - 4bytes
    bool - 1bytes
    double - 8bytes

    # Type Casting
    converting data from one type to another
    1) conversion [implicit] small to big
    2) Casting [explicit] big to small
    int ---> char string.valueOf(number)

    string ---> int parseInt(String)

    # Operators

    1) Arithematic +,-,*,/,%

    2) Relation <, <=, >= ,> , ==, !=

    3) Logical  OR ||   AND &&  NOT ! 
   
    4) Unary Operators
      Increment++
      pre ++a   post a++
      Decrement-- 
      pre --a   post a--
*/

class VariablesDataTypesAndOperator{
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        System.out.println("Increament");
        System.out.println(b);
        System.out.println(a);
        int c = ++a;
        System.out.println(c);
        System.out.println(a);

        int f = 5;
        int g = f--;
        System.out.println("Decrement");
        System.out.println(g);
        System.out.println(f);
        int k = --f;
        System.out.println(k);
        System.out.println(f);
    }
}



