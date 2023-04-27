public class Bus {
    int bus_line; // номер маршрута
    String driver; // водитель
    int capacity; // вместимость
    int speed; // скорость автобуса
    int price; // стоимость проезда

    public Bus(int bus_line, String driver, int capacity, int speed, int price) {
        this.bus_line = bus_line;
        this.driver = driver;
        this.capacity = 36;
        if (speed<=60) {
            this.speed = speed;
        } else {
            System.out.println("Автобус с очень высокой скоростью, это небезопасно!");
        }

        this.price = price;
    }
}
