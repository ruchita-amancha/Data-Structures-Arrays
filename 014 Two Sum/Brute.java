
public class Brute {

    public static boolean isTwoSum(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        if (isTwoSum(arr, 16)) {
            System.out.println("Sum is present ");
        }
        else{
            System.out.println("No Elemets found");
        }
    }
}
