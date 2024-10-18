
import java.util.Arrays;

public class LittleBetter {

    public static void isTwoSum(int arr[], int target) {

        Arrays.sort(arr);
        int i = 0, n = arr.length, j = n - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                System.out.println(arr[i]+" "+arr[j]);
                break;
            }
            else if(arr[i] +arr[j]>target) j++;

            else i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        isTwoSum(arr, 6);
    }
}
