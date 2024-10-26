
public class Moore_Algorithm {

    public static int mooreAlgo(int arr[]) {
        int n = arr.length, count = 0, el = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                el = arr[i];
            } else if (arr[i] == el) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el) {
                count1++;
            }
        }
        if (count1 > (n / 2)) {
            return el;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 1, 0};
        System.out.println(mooreAlgo(arr));
    }
}
