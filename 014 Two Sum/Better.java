
import java.util.HashMap;


public class Better {

    public static void isTwoSum(int arr[],int target) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int diff=0;
            diff=target-arr[i];
            if(map.containsKey(diff)){
                System.out.println("Sum of " + arr[i] +" and "+ diff);
                break;
            }
            else{
                map.put(arr[i],i);
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        isTwoSum(arr, 61);
    }
}
