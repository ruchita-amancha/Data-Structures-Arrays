
public class stock {

    public static int calculateProfit(int arr[]) {
        int n = arr.length;
        int profit = 0, mini = arr[0];
        for (int i = 1; i < n; i++) {
            int cost = arr[i] - mini;
            profit = Math.max(cost, profit);
            mini = Math.min(mini, arr[i]);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3,5,1,4,6};
        System.out.println(calculateProfit(arr));
    }
}
