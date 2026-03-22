import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // Java program to calculate the area of a triangle using base and height
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of the triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of the triangle: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area of Triangle: " + area);

        sc.close();
    }
}
