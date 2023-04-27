public class Circle extends Shape {

    double radius;

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }
    public double square (){
        return Math.PI * radius * radius;

    }
}
