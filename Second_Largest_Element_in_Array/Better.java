
import java.util.Scanner;

public class Better {

    public static int getSecondLargest(int[] arr) {
        int n = arr.length;

        if (n <= 2 && arr[0] == arr[1]) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int Sec_largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > Sec_largest && arr[i] != largest) {
                Sec_largest = arr[i];
            }
        }

        return Sec_largest;
    }

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array length and then array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = inputArray();
        System.out.println("Second Largest Element " + getSecondLargest(arr));
    }
}
