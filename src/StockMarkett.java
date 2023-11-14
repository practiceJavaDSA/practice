import java.util.Scanner;

public class StockMarkett {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter the array element: ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int maximumProfit = maxProfit(arr);
        System.out.println("Maximum profit: "+ maximumProfit);
    }
    static int maxProfit(int [] arr){
        int minPro = Integer.MAX_VALUE;
        int maxPro = 0;

        for(int j : arr){
            minPro = Math.min(j, minPro);
            maxPro = Math.max(maxPro, j-minPro);
        }
        return maxPro;
    }
}
