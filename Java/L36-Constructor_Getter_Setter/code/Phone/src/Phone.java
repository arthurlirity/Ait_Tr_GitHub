public class Phone {
    String phoneNumber;
    String brand;
    String model;

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public void receiveCall (String name) { // сигнатура метода - это вся первая строчка
        System.out.println("Звонит: " + name);
    }

    public String getPhoneNumber() { // геттер для телефонного номера
        return phoneNumber;
    }

    // это конструктор класса
    public Phone(String phoneNumber, String brand, String model) {
        this.phoneNumber = phoneNumber;
        this.brand = brand;
        this.model = model;
    }

    // это сеттер, он может установить телефонный номер для конкретного экземпляра класса
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
