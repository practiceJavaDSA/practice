import java.util.Arrays;
import java.util.Scanner;

public class productExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int n = sc.nextInt();
        int [] arr = new int [n];

        System.out.println("Enter the array length: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int [] productExceptSelfAns = productExceptSelF(arr);
        System.out.println("Ans is: "+ Arrays.toString(productExceptSelfAns));
    }
    public static int [] productExceptSelF (int [] nums){
        int n = nums.length;
        int [] ans = new int [n];
        int [] prefix = new int[n];
        int [] suffix = new int[n];

        prefix[0] = 1;
        for (int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] * nums[i-1];
        }
        suffix[n-1] = 1;
        for (int i = n-2; i >= 0; i--){
            suffix[i] = suffix[i + 1] * nums [i+1];
        }
        for (int i = 0; i < n; i++){
            ans[i] = prefix[i] * suffix [i];
        }
        return ans;
    }
}
