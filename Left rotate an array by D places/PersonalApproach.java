
public class PersonalApproach {

    public static void leftRotate(int nums[], int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k is larger than the array length

        // Rotate the array k times to the right
        for (int j = 1; j <= k; j++) {
            // Store the last element
            int last = nums[0];
            // Shift all elements one position to the right
            for (int i = 1; i < n ; i++) {
                nums[i - 1] = nums[i];
            }
            // Set the first element to the previously stored last element
            nums[n - 1] = last;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        leftRotate(arr, k);
        System.out.println("After rotation:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
