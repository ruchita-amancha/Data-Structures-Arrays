
public class Optimal {

    public static int[] moveZerors(int arr[]) {
        int n = arr.length, j = -1;

        // first we find if any zero exists in the array 
        // if yes then assign index of first zero element to j and break
        // if no then return same arr
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return arr;
        }

        // if element is non-zeror then we swap  so that non-zeror ele comes ahead and zeror elemnt is in the last
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }
        return arr;

    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 0, 6, 7};
        int[] ans = moveZerors(arr);
        System.out.println("move zerors");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");

        }
    }
}
