import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Java Program To Check Whether a Given number is even or odd using the modulus (%) operator
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }

        sc.close();
    }
}
