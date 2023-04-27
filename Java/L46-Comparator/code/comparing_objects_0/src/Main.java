import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сортируем работников (Обьекты класса Employee)");
        System.out.println();

        ArrayList<Employee> employeeList = new ArrayList<Employee>(); // обьявили ArrayList для сотрудников

        // создаем обьекты и кладем в ArrayList
        employeeList.add(new Employee(1040,"Andrei", "Berlin"));
        employeeList.add(new Employee(1020,"Yakov", "Munchen"));
        employeeList.add(new Employee(1010,"Peter", "Hamburg"));

        // печатаем ArrayList в порядке его создания
        System.out.println("Unsorted Data");
        for (int i=0; i<employeeList.size(); i++){
            System.out.println(employeeList.get(i));
        }
        System.out.println();

        Collections.sort (employeeList, new SortID()); // вызываем метод sort для коллекции
        System.out.println("Sorted data according to Employee IDs");

        // печатаем
        for (int i = 0; i < employeeList.size(); i++){
            System.out.println(employeeList.get(i));
        }
        System.out.println();

        Collections.sort(employeeList, new SortbyName());
        // печатаем

        System.out.println("Sorted data according to Employee name");
        for (int i=0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }

    }
}