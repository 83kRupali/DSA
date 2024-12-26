//package Apna_College.Arrays;

/*
 * Arrays 1st data structures
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {

    // find smallest and largest in Arrays

    public static void smallAndLarge(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }

    // find smallest and largest in Arrays Index

    public static void smallAndLargeIndex(int arr[]){
        int max = Integer.MIN_VALUE;
        int maxI = 0;
        int min = Integer.MAX_VALUE;
        int minI = 0;

        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                maxI = i;

            }
            if(min > arr[i]){
                min = arr[i];
                minI = i;
            }
        }

        System.out.println("Maximum: "+max+" index:"+ maxI);
        System.out.println("Minimum: "+min+" index:"+ minI);
    }

    // pass by reference
    public static void passByReference(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = 2*arr[i];
        }
    }

    //Linear search

    public static int linearsearch(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    //reverse the array

    public static void reverseArray(int arr[]){
        // for(int i=0; i<arr.length/2; i++){
        //     int temp = arr[i];
        //     arr[i] = arr[arr.length-i-1];
        //     arr[arr.length-1-i] = temp;
        // }

        int start = 0; 
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // WAF to calculate sum and product of all the numbers in an arrays.

    public static void ProAndSum(int arr[]){
        int pro = 1;
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            pro *= arr[i];
            sum += arr[i];
        }

        System.out.println("Product: "+pro);
        System.out.println("Sum: "+sum);
    }
    //WAF to swap the max and min number of an array.

    public static void swapMaxAndMin(int arr[]){
        int max = Integer.MIN_VALUE;
        int maxI = 0;
        int min = Integer.MAX_VALUE;
        int minI = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                maxI = i;
            }
            if(arr[i]<min){
                min = arr[i];
                minI = i;
            }
        }

        arr[minI] = max;
        arr[maxI] = min;
    }

    //WAF to print all the unique values in an arrays.
     
    public static void uniqueValues(int arr[]){
        boolean vis[] = new boolean[arr.length];
        Array.
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    continue;
                }
                else{
                    ans.add(arr[j]);
                }
            }
        }

        System.out.println("unique");
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }

    //WAF to print intersection of 2 arrays.
    public static void main(String[] args) {
        int mark[];

        mark = new int[5];

        int num[] ={3,4,5,4};
        //0 to size -1
        System.out.println(num.length);

        num[0] =2;
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int mat[] = new int[3];

        // System.out.println("Enter the three number:");
        // for(int i=0; i<3; i++){
        //    mat[i] = sc.nextInt();
        // }

        // System.out.println("Array..");
        // for(int i=0; i<3; i++){
        //     System.out.print(mat[i]+" ");
        // }
        System.out.println();

        int num2[] = {5,4,3,7,8,9};
        smallAndLarge(num2);


        smallAndLargeIndex(num2);

        int num3[] = {2,3,4,5};

        passByReference(num3);
        for(int i = 0; i<num3.length; i++){
            System.out.print(num3[i]+" ");
        }
        System.out.println();
        System.out.println(linearsearch(num3, 10));
        reverseArray(num3);

        int arr1[] = {1,2,3,4,5};
        ProAndSum(arr1);
        swapMaxAndMin(arr1);
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        int arr2[] = {1,2,3,4,5,5,4,3};
        uniqueValues(arr2);
    }

}
