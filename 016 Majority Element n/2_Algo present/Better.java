
import java.util.HashMap;
import java.util.Map;

public class Better {
    public static int majorityElement(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
           if(map.containsKey(arr[i])){
            map.put(arr[i], map.get(arr[i])+1);
           }
           else{
            map.put(arr[i],1);
           }
        }
        for(Map.Entry<Integer,Integer> ele:map.entrySet()){
            if(ele.getValue()>(n/2)){
                return ele.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 1, 0};
        System.out.println(majorityElement(arr));
    }
}
