import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        // Java Program to Determine a Student's Grade Based on Marks Using if-else Conditions
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } 
        else if (marks >= 80) {
            System.out.println("Grade: B");
        } 
        else if (marks >= 70) {
            System.out.println("Grade: C");
        } 
        else if (marks >= 60) {
            System.out.println("Grade: D");
        } 
        else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}
