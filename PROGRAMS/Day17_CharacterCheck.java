import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("It is an Alphabet Character");
        } 
        else {
            System.out.println("It is NOT an Alphabet Character");
        }

        sc.close();
    }
}
