import java.util.Scanner;

public class RectangleCalculations {
    public static void main(String[] args) {
        // Java Program to Calculate the Area and Perimeter of a Rectangle using User Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);

        sc.close();
    }
}
