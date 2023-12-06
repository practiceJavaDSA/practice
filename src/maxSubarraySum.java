import java.util.Scanner;

public class maxSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter the array element: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = maxSubarraySumm(arr, n);
        System.out.println("The maximum subarray sum is: "+result);
    }
    public static int maxSubarraySumm (int [] arr, int n){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum = sum + arr[k];
                }
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}
