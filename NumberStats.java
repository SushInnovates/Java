import java.util.Scanner;

public class NumberStats {

    public static int countDigits(int n) {
        n = Math.abs(n);
        if (n == 0) return 1;

        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Number of digits: " + countDigits(num));
        sc.close();
    }
}
