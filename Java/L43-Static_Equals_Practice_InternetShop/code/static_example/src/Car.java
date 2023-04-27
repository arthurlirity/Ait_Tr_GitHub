public class Car {

    static final String platform = "Number One";
    int age; // это возраст
    String color; // это цвет

    public Car(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public void paint() {
        System.out.println("Автомобиль покрашен в " + color + " цвет.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", platform='" + platform +'}';
    }
}
