
public class Kadane_Algo {

    public static int maxiSubarray(int arr[]) {
        int n = arr.length, maxi = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

            maxi = Math.max(maxi, sum);

            if (sum < 0) {
                sum = 0;
            }

        }

        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, -2, 2, -1, 0};
        System.out.println(maxiSubarray(arr));
    }
}
