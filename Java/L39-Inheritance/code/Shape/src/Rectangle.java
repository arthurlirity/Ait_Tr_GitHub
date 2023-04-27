public class Rectangle extends Shape {


    double a; // длина
    double b; // ширина

    public Rectangle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    public double square() {
        return a * b;
    }
}


