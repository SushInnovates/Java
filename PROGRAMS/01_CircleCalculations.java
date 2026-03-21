import java.util.*;
public class Circle {
    public static void main(String []args) {
        // Java program to calculate Area, Diameter and Circumference of a circle using user input.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area of Circle: " + area);
        System.out.println("Diameter of Circle: " + diameter);
        System.out.println("Circumference of Circle: " + circumference);

        sc.close();
    }
}
