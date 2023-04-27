public class Main {
    public static void main(String[] args) {

        System.out.println("Пример интерфейса в Java");

        Vehicle vehicle = new Vehicle(); //create object
        vehicle.moveFast(); // use method from Interface Move
        vehicle.moveSlow(); // use method from Interface Move


    }
}