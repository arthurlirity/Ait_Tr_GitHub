import java.util.ArrayList;
import java.util.TreeSet;
import java.util.List;
import java.util.Arrays;

public class Main {

    // как сравнить два числа
    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Сравнение объектов класса Human");

        Human peter = new Human("Петр", 200, 78, 27);
        Human daniil = new Human("Даниил", 178, 83, 22);
        Human viktor = new Human("Виктор", 182, 90, 24);
        Human andrei = new Human("Андрей", 165, 45, 18);
        Human yakov = new Human("Яков", 185, 65, 23);
        Human alex = new Human("Алексей", 185, 65, 23);

        String[] names = {"Петр", "Даниил", "Виктор", "Андрей", "Яков", "Алексей"}; // массив строк с именами

        Human[] humans = {peter, daniil, viktor, andrei, yakov, alex}; // массив объектов типа Human

        sort(names); // сортировка имен по алфавиту
        System.out.println(Arrays.toString(names));

        sort(humans); // сортировка по росту
        System.out.println(Arrays.toString(humans));


    }
}
