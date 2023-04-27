public class Main {
    public static void main(String[] args) {
        System.out.println("Площади фигур");

        double r = 10;

        // круг
        Circle o1 = new Circle("Circle", r);
        double s_circle = o1.square(); // используем метод класса
        System.out.println("Площадь круга " +s_circle);


        // треугольник
        double a = 100;
        double h = 200;
        Triangle t1 = new Triangle("Triangle",a, h);
                double s_triangle = t1.square();
        System.out.println("Площадь треугольника " + s_triangle);
        }


        Trapezoid trap1 = new Trapezoid("", "5", "10", "15") {
            double s_trap = trap1.square()
            System.out.println( "Площадь тррапеции:" + s_trap);
        }




}
