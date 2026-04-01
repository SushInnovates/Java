import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        // Java program to check whether a given number is positive, negative, or zero using if-else conditions
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number is Positive");
        }
        else if (num < 0) {
            System.out.println("The number is Negative");
        }
        else {
            System.out.println("The number is Zero");
        }

        sc.close();
    }
}
