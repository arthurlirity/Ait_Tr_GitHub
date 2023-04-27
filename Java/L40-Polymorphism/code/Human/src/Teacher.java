public class Teacher extends Human {
    // конструктор класса
    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    // переопределяем метод work
    @Override
    public void work() {
        System.out.println("Учить и объяснять");
        study(); // дополнительный метод
    }

    // реализация метода study
    public void study() {
        System.out.println("Учимся...");
    }
}
