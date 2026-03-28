import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Java Program to Calculate Simple Interest using Principal Amount, Rate Of Interest, and Time
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);

        sc.close();
    }
}
