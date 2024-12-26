//package Apna_College.Sorting;

public class Sorting {

    // bubble  Sort
    // Time Complexity : O(n)
    public static void bubbleSort(){
        int arr[] = {4,1,5,2,3};
        int n = 5;

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Selection Sort
    // Time Complexity: O(n^2)
    public static void selectionSort(){
        int arr[] ={4,1,5,2,3};
        int n = 5;

        for(int i=0; i<n-1; i++){
            int smallest = i;

            for(int j=i+1; j<n; j++){
                if(arr[j]< arr[smallest]){
                    smallest = j;
                }
            }
                int temp =arr[i];
                arr[i]= arr[smallest];
                arr[smallest] = temp;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //insertion sort
    //Time Complexity: O(n^2)
    public static void insertion(){
        int arr[] ={4,1,5,2,3};
        int n = 5;

        for(int i=1; i<n; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
        }
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        bubbleSort();
        selectionSort();
        insertion();
    }
}

