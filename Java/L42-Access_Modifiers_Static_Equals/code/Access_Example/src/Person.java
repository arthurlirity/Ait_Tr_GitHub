public class Person {
    String name; // имя человека, возможно с фамилией, модификатор "по умолчанию" = public
    protected int age; // возраст персоны, protected - и что???
    public String address; // строка с адресом персоны, модификатор public
    private String phone; // строка с цифрами тел. номера

    // конструктор
    public Person(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    // это метод, который отображает на экране имя персоны
    public void displayName() {
        System.out.printf("Name: %s \n", name); // формат отображения - имя встанет вместо буквы s,
        // \n - перенос на новыю строку
    }

    // это метод, который отображает на экране возраст персоны
    void displayAge() {
        System.out.printf("Age: %d \n", age); // %d - это для чисел (digital)
    }

    // это метод, который отображает на экране адрес персоны
    private void displayAddress() {
        System.out.printf("Address: %s \n", address);
    }

    // это метод, который отображает на экране телефон персоны
    protected void displayPhone() {
        System.out.printf("Phone: %s \n", phone);
    }
}