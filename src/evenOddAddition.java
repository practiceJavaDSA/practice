import java.util.Scanner;

public class evenOddAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int n = sc.nextInt();
        int evenDigit = 0, oddDigit = 0;
        while (n > 0){
            int digit = n%10;
            if(digit % 2 == 0){
                evenDigit = evenDigit + digit;
            }
            else {
                oddDigit = oddDigit + digit;
            }
            n = n/10;
        }
        System.out.println(evenDigit+" "+oddDigit);
    }
}
