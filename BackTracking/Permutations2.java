public class Permutations2 {

    public static void permutations2(StringBuilder str , int idx){

        if(idx == str.length()-1){

            for(int i=0; i<str.length(); i++){
                System.out.print(str.charAt(i)+" ");
            }
            System.out.println();
            return;
        }

        for(int i=idx; i<str.length(); i++){
            swap(str, i, idx);
            permutations2(str, idx+1);
            swap(str, i, idx);
        }
    }

    public static void swap(StringBuilder str , int i, int j){
        char temp = str.charAt(i);
        str.setCharAt(i,str.charAt(j));
        str.setCharAt(j,temp);
    }

    public static void permutations21(char str[], int idx){

        if(idx == str.length-1){
            for(int i=0; i<str.length; i++){
                System.out.print(str[i]+" ");
            }
            System.out.println();
            return;
        }

        for(int i=idx; i<str.length; i++){
            swap1(str, i, idx);
            permutations21(str, idx+1);
            swap1(str, i, idx);
        }
    }

    public static void swap1(char str[], int i, int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
    public static void main(String[] args) {
        StringBuilder str =new StringBuilder("abc");
        permutations2(str, 0);
        
        System.out.println("Permutions...................");
        char array[] = {'a','b','c'};
        permutations21(array, 0);

    }
}
