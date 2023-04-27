import java.util.Comparator;

public class SortID implements Comparator <Employee> {
    //нужно имплементировать (создать / прописать) метода compare (01 o1, 02 o2)
    public int compare (Employee a, Employee b){
        return a.empID - b.empID; // сравнение номера в математическом порядке
        // при условии, что у сотрудника идет нумерация в возрастающем порядке
    }
}
