import java.util.ArrayList;
import java.util.HashSet;

public class UnionAndIntertn {

    public static void unionAndIntertn(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        ArrayList<Integer>ans = new ArrayList<>();

        for(int i:arr1){
            set.add(i);
        }

        for(int i:arr2){
            if(set.contains(i)){
                ans.add(i);
                set.remove(i);
            }
            else{
                set.add(i);
            }
        }

        for(Integer i:set){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i:ans){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4,7,3};
        unionAndIntertn(arr1, arr2);
    }
}
