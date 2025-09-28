
public class Operators {

    void Arithmetic() {
        System.out.println("Arithmetic Operators : ");  //+,-,*,/,%
        int a = 100, b = 20, c;
        System.out.println(" Addition :" + a + b);
        c = a - b;
        System.out.println("Subtraction : " + c);
        c = a * b;
        System.out.println("Multiplication : " + c);
        c = a / b;
        System.out.println("Division : " + c);
        c = a % b;
        System.out.println("Modulus : " + c);
        System.out.println();

    }

    void Relational() {
        int a = 100, b = 40, c;
        System.out.println(+a == b);
        System.out.println(+a != b);
        System.out.println(+a > b);
        System.out.println(+a < b);
        System.out.println(+a <= b);
        System.out.println(+a >= b);
         System.out.println();
    }

    void Logical() {
        int a = 20, b = 30;
        System.out.println(a >= b && a < b);
        System.out.println(a >= b || a < b);
        System.out.println(!(a >= b || a < b));
         System.out.println();

    }

    void Assignment() {
        int x = 10;
        x += 10;
        System.out.println(+x);
        x -= 10;
        System.out.println(+x);
        x *= 10;
        System.out.println(+x);
        x /= 10;
        System.out.println(+x);
        x %= 10;
        System.out.println(+x);
         System.out.println();
    }

    void Unary() {
        int y = 10;
        System.out.println(+y);

        y++;
        System.out.println(+y);
        y--;
        System.out.println(+y);
        System.out.println(+-y);
         System.out.println();

    }
    
    void Ternary(){
        int age=21;
        String out = (age>=21) ? "You are Eligible!" : "You are not Eligible!";
        System.out.println(out);
           
    }

    public static void main(String[] args) {
        System.out.println("Operators : ");
        System.out.println("\t1> Operators in java is used to perform operations like arithmetic,relational,logical,assignment,unary,ternary operations on variables.");
        System.out.println("\t2> It is used to manipulate data and change the flow of the program .");

        Operators D = new Operators();
        D.Arithmetic();
        D.Relational();
        D.Logical();
        D.Assignment();
        D.Unary();
        D.Ternary();
    }
}
