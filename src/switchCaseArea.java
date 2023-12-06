import java.util.Scanner;

public class switchCaseArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        double [] a = new double[num];

        for(int i = 0; i < num; i++){
            a[i] = sc.nextInt();
        }
        double area = 0.0;
        switch (num){
            case 1:
                area = Math.PI * a[0] * a[0];
                break;
            case 2:
                area = a[0]*a[1];
                break;
            default:
                System.out.println("Invalid Number, Please try again!");
        }
        System.out.println(area);
    }
}
