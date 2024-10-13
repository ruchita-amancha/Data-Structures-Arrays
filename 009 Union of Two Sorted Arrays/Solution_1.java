
import java.util.HashSet;

public class Solution_1 {

    public static HashSet<Integer> union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        return set;
    }

    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        HashSet<Integer> Union = union(arr1, arr2);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union) {
            System.out.print(val + " ");
        }
    }
}
    