import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array element: ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int maxProfit = maxProfit(arr);
        System.out.println("Max Profit: " + maxProfit);
    }
    static int maxProfit(int [] arr){
        int maxPro = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    maxPro = Math.max(arr[j] - arr[i], maxPro);
                }
            }
        }
        return maxPro;
    }
}
