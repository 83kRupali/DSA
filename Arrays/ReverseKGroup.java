import java.util.ArrayList;

public class ReverseKGroup {
    public static void reverseInGroups(ArrayList<Integer> arr, int k) {
        for (int i = 0; i < arr.size(); i += k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.size() - 1);
            reverse(arr, left, right);
        }
    }

    public static void reverse(ArrayList<Integer> arr, int i, int j) {
        while (i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        reverseInGroups(arr, 2);

        // Corrected print loop
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
