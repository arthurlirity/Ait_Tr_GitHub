import java.util.Comparator;

public class SortbyName implements Comparator<Employee> {
    public int compare (Employee a, Employee b) {
        return a.name.compareTo(b.name); //сравниваем имена в алфовитном порядке
        // метод compareTo - стандартный для строк
    }
}
