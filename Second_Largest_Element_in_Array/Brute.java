import java.util.Arrays;
import java.util.Scanner;



public class Brute {
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

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static int getSecondLargest(int[] arr) {
        int n = arr.length;

        if (n <= 2 && arr[0] == arr[1]) {
            return -1;
        }
        Arrays.sort(arr);

        int largest = arr[n - 1];
        int Sec_largest = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                Sec_largest = arr[i];
                break;
            }
        }

        return Sec_largest;
    }

    public static void main(String[] args) {
        int arr[] = inputArray();
        System.out.println("Second Largest Element " + getSecondLargest(arr));
    }
}
