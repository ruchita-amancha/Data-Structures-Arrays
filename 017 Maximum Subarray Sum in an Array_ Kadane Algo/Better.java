
public class Better {

    public static int maxiSubarray(int arr[]) {
        int n = arr.length, maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                maxi = Math.max(maxi, sum);
            }

        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, -2, 2, -1, 0};
        System.out.println(maxiSubarray(arr));
    }
}
// TC------->O(n²)  SC===>O(1)
