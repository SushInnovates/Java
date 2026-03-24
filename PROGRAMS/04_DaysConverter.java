import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        // Java program to convert a given number of days into years, weeks, and remaining days
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);

        sc.close();
    }
}
