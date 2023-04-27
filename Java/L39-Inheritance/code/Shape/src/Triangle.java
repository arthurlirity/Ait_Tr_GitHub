public class Triangle extends Shape {

    double a; // длина стороны треугольника
    double h; // высота, проведенная к основанию

    public Triangle(String name, double a, double h) {
        super(name);
        this.a = a;
        this.h = h;
    }

    public double square() {
        return (a * h) / 2;
    }
}
