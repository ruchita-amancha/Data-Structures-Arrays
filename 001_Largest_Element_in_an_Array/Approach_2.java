
import java.util.Arrays;


public class Approach_2 {

    public static void main(String[] args) {
        Approach_1 app1=new Approach_1();
        int arr[]=app1.inputArray();
        Arrays.sort(arr);
        System.out.println("Largest Element is " + arr[arr.length-1]);
    }
}
