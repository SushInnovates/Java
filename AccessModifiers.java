class Demo {
    public int pub = 10;       // public → everywhere
    private int pri = 20;      // private → same class only
    int def = 30;              // default → same package only
    protected int pro = 40;    // protected → same package + subclasses

    public void show() {
        System.out.println("Public: " + pub);
        System.out.println("Private: " + pri);
        System.out.println("Default: " + def);
        System.out.println("Protected: " + pro);
    }
}

class Child extends Demo {
    void showChild() {
        System.out.println("Access in Child → public: " + pub);
        // System.out.println(pri); // ❌ private not accessible
        System.out.println("Access in Child → default: " + def);
        System.out.println("Access in Child → protected: " + pro);
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println("Access in Main → public: " + d.pub);
        // System.out.println(d.pri); // ❌ private not accessible
        System.out.println("Access in Main → default: " + d.def);
        System.out.println("Access in Main → protected: " + d.pro);

        d.show();

        Child c = new Child();
        c.showChild();
    }
}
