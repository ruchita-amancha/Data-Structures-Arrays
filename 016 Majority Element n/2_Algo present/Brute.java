
public class Brute {

    public static int majorityElement(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;  //initialize it as 1 as we include the arr[i]
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (count > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 1, 0};
        System.out.println(majorityElement(arr));
    }
}
