package Project1;
import java.util.Scanner;
public class P6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        if (num <= 1) {
            System.out.println("NOT PRIME");
        } else  {
            boolean isPrime=true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("NOT PRIME");
                     isPrime=false;
                    break;
                }
                }
            if (isPrime) {
                System.out.println("PRIME");
            }
            }














    }
}
