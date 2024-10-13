
import java.util.ArrayList;

public class Brute {

    public static int[] moveZerors(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                list.add(arr[i]);
            }
        }
        int listLength = list.size();
        for (int i = 0; i < listLength; i++) {
            arr[i] = list.get(i);
        }

        for (int i = listLength; i < arr.length; i++) {
            arr[i] = 0;

        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 0, 6, 7};
        int[] ans = moveZerors(arr);
        System.out.println("move zerors");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");

        }
    }
}
