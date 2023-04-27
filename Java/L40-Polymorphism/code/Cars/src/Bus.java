public class Bus extends Car {

    // конструктор класса
    String brand;
    int seats;

    // конструктор класса


    public Bus(int age, String usage, int speed, String brand, int seats) {
        super(age, usage, speed);
        this.brand = brand;
        this.seats = seats;
    }

    // getter
    public String getBrand () {
        return brand;
    }

    // setter
    public void setBrand (String brand) {
        this.brand = brand;
    }

    // setter
    public void setSeats (int seats) {
        this.seats = seats;
    }

    @Override
    public void go () {
        System.out.println("Едем по дороге с пассажиром");
        this.speed = speed;
    }

    @Override
    public void stop() {
        System.out.println("Автобус остановился");
        speed = 0;
    }

    @Override
    public void speed_up() {
        super.speed_up();
    }

    @Override
    public void speed_down() {
        super.speed_down();
    }
}