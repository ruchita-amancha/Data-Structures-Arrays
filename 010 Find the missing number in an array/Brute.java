
public class Brute {

    public static int findElement(int arr[], int n) {
        for (int i = 1; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {

        int a[] = {1, 2, 3, 4};
        int N = a.length;
        int ans = findElement(a, N);
        System.out.println("The missing number is: " + ans);
    }
}
