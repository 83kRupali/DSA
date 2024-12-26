
import java.util.Arrays;

public class Sorted0s1s2s {

    //leetCode : 75
    //time Complexity :  O(logn)

    public static void sorted0s1s2s1(){
        int arr[] = {2,0,2,1,1,0,1,2,0,0};
        int n = arr.length;

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //time Complexity :  O(n)
    public static void sorted0s1s2s2(){
        int arr[] = {2,0,2,1,1,0,1,2,0,0};
        int n = arr.length;

        int zero = 0;
        int one = 0;
        int two = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                zero++;
            }
            else if(arr[i] == 1){
                one++;
            }
            else{
                two++;
            }
        }

        int idx = 0;
        for(int i=0; i<zero; i++){
            arr[idx++] = 0;
        }

        for(int i=0; i<one; i++){
            arr[idx++] = 1;
        }

        for(int i=0; i<two; i++){
            arr[idx++] = 2;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void sorted0s1s2s3(){
        int arr[] = {2,0,2,1,1,0,1,2,0,0};
        int n = arr.length;

        int low = 0, mid = 0, high = n-1;
        
        while (mid<=high) {

            if(arr[mid] == 0){  //0 number
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 1){  //1 sort
                mid++;
            }
            else{  // 2 num
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        sorted0s1s2s1();
        sorted0s1s2s2();
        sorted0s1s2s3();
    }
    
}
