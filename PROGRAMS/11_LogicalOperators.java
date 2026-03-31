public class LogicalOperators {
    public static void main(String[] args) {
        // Java program demonstrating logical operators such as AND (&&), OR (||), and NOT (!)
        int a = 10;
        int b = 5;

        System.out.println("a > 5 && b < 10 : " + (a > 5 && b < 10));
        System.out.println("a > 5 || b > 10 : " + (a > 5 || b > 10));
        System.out.println("!(a > b) : " + !(a > b));

    }
}
