import java.util.Scanner;

public class DivisibleCheck {
    public static void main(String[] args) {
        // Java Program to Check Whether a Number Is Divisible by another number using the modulus (%) operator
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        if (num % divisor == 0) {
            System.out.println("The number is divisible.");
        } 
        else {
            System.out.println("The number is not divisible.");
        }

        sc.close();
    }
}
