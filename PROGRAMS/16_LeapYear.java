import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Java program to check whether a given year is a leap year or a common year using conditional statements
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("It is a Leap Year");
        } 
        else {
            System.out.println("It is a Common Year");
        }

        sc.close();
    }
}
