import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int sub3 = sc.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        int sub4 = sc.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        int sub5 = sc.nextInt();

        int total = sub1 + sub2 + sub3 + sub4 + sub5;

        double average = total / 5.0;
        double percentage = (total / 500.0) * 100;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}
