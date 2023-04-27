public class Salary extends Employee{ // расширение класса Employee / унаследование

    private double salary;


    // конструктор для класса Salary
    public Salary(String name, String email, int ID_num, double salary) {
        super(name, email, ID_num);// Вытаскиваем поля из родительского класса Employee
        this.salary = salary; // добавили к ним зарплату
    }

    public void mailPaySlip() {
        System.out.println("Это метод класса Salary");
        System.out.println("Уважаемый " + getName() + ", направляем информацию о вашей зарплате " + getEmail());
        System.out.println("Ваша годовая зарплата " + getSalary());
        System.out.println("Ваша ежемесячная зарплата " + getSalary()/12);
    }

    // Getter по зарплате
    public double getSalary() {
        return salary;

    }
    // Setter для зарплаты

    public void setSalary(double newSalary) { // переведем в метод значение newSalary
        this.salary = salary;
        if (newSalary >0) { // если зарплата положительная, то ее назначаем
            salary = newSalary;
        }
    }
}
