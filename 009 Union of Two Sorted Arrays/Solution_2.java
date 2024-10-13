
import java.util.ArrayList;

public class Solution_2 {

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[]) {
        int n = arr1.length, m = arr2.length, i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (list.size() == 0 || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);

                }
                i++;

            } else {
                if (list.size() == 0 || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);

                }
                j++;
            }
        }
        while (i < n) {
            if (list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;

        }
        while (j < m) {
            if (list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
        }
        return list;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union = findUnion(arr1, arr2);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union) {
            System.out.print(val + " ");
        }
    }
}
