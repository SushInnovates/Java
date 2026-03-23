import java.util.Scanner;

public class RectangleCalculations {
    public static void main(String[] args) {
        // Java program to calculate the area and perimeter of a rectangle using user input
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
