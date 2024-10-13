
public class LinearSearch {

    public static int linearSearch(int arr[], int element) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 0, 6, 7};
        int ans = linearSearch(arr, 96);
        if (ans == -1) {
            System.out.println("Element is not found");

        } else {
            System.out.println("Element is found at " + ans);
        }

    }
}
