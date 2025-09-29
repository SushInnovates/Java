class Car {
    String make;
    int year;

    // Parameterized constructor
    Car(String m, int y) {
        make = m;
        year = y;
    }

    void display() {
        System.out.println("Make: " + make + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car c = new Car("BMW", 2022);
        c.display();
    }
}
