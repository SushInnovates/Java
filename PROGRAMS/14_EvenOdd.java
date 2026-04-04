import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Java Program To Check Whether a Given Number Is Even or Odd Using the Modulus (%) Operator
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
