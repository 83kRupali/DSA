public class MergeTwoArrays {

    //leetcode - 88
    //Merge two sorted Array
    //TimeComplexity: O(m+n)

    public static void mergeTwoArrays(){
        int B[] = {2,5,6};
        int n = B.length;

        int A[] = {1,2,3,0,0,0};  
        int m =3;

        int idx = m+n-1;
        int i=m-1,  j=n-1;
  
        while(i>=0 && j>=0){
            if(A[i]>=B[j]){
                A[idx] = A[i];
                idx--; i--;
            }
            else{
                A[idx] = B[j];
                idx--;
                j--;
            }
        }

        while(j>=0){
            A[idx] = B[j];
            idx--;
            j--;
        }

        for(int k=0; k<m+n; k++){
            System.out.print(A[k]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        mergeTwoArrays();
    }
}