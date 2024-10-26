
public class Brute {

    public static int maxSubarray(int arr[]) {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {                   //   0----n
            for (int j = 0; j < n; j++) {               //   0-----n
                int sum = 0;
                for (int k = i; k <= j; k++) {          //   i-----j  where i may be 0 and j may be n
                       sum = sum + arr[k];
                }
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, -2, 2, -1, 0};
        System.out.println(maxSubarray(arr));
    }

    // TC~O(n³) and SC=O(1)
}
