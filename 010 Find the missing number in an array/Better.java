
public class Better {

    public static int findMissing(int arr[]) {

        int[] hash=new int[arr.length+1];
        for(int i=0;i<arr.length-1;i++)
            hash[arr[i]]++;

        for(int i=1;i<=arr.length;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5};
        int N = a.length;
        int ans = findMissing(a);
        System.out.println("The missing number is: " + ans);
    }
}
