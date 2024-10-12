
import java.util.Scanner;

public class Approach_1 {

    public static int largest(int[] arr) {
        int size = arr.length;
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
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
        System.out.println("Largest Element is " + largest(arr));
    }
}
