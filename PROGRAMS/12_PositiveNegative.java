import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        // Java Program to Check Whether a Given Number is Positive, Negative, or Zero Using If-Else Conditions
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
