import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        switch (number){
            case 1:
                System.out.println("Batsman");
                break;
            case 2:
                System.out.println("Bowler");
                break;
            case 3:
                System.out.println("Wicket-keepar");
                break;
            case 4:
                System.out.println("All-rounder");
                break;
            case 5:
                System.out.println("Captain");
                break;
            default:
                System.out.println("Invalid Number, Please try again!");
        }
    }
}
