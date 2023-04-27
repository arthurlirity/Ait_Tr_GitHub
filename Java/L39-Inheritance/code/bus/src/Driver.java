public class Driver {
    String name;
    int age;
    Bus bus; // автобус, на котором ездит водитель

    // конструктор с контролем
    public Driver(String name, int age) {
        this.name = name;
        if (age >= 21 && age <= 65) {
            this.age = age;
            System.out.println("Водитель допущен у правлению автобусом");
        } else {
            System.out.println("Водитель не допущен у правлению автобусом");
        }
    }

    public String getName() {
        return name;
    }

    // метод, который сажает водителя на автобус
    public void go(Bus bus) {
        this.bus = bus;
        this.bus.setDriver(this);
    }

    // метод, который отображает, что водитель поехал на автобусе
    public void drive() {
        this.bus.go();  // вызываем метод из класса Bus
    }

    public int getAge() {
        return age;
    }

}
