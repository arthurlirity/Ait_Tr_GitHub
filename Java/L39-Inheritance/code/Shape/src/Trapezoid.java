public abstract class Trapezoid extends Shape {


    double sidea;
    double sideb;
    double sidec;

    public Trapezoid(String name, double a, double b, double c) {
        super(name);
        this.sidea = sidea;
        this.sideb = sideb;
        this.sidec = sidec;
    }

    public double square() {
        return (sidea + sideb) * sidec / 2;
    }

}