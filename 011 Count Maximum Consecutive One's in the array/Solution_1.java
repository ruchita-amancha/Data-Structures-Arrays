
public class Solution_1 {

    public static int findMaxConsecutive(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 0, 1, 1, 1};
        int ans = findMaxConsecutive(nums);
        System.out.println("The maximum  consecutive 1's are " + ans);
    }
}
