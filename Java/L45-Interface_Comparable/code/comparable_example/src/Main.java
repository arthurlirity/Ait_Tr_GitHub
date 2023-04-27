import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сравнение Домов:");

        // создаем объекты класса
        House h1 = new House( 100, 150000, "New York");
        House h2 = new House( 85, 120000, "London");
        House h3 = new House( 120, 180000, "Berlin");
        House h4 = new House(50, 200000, "Moscow");

        // объявляем TreeSet
        TreeSet housesList = new TreeSet<>();

        // Заполняем TreeSet

        housesList.add(h1);
        housesList.add(h2);
        housesList.add(h3);
        housesList.add(h4);


        System.out.println(housesList);

    }
}













/*

        TreeSet<House> houses = new TreeSet<House>();

        House h1 = new House(100, 120000, "Tokyo");
        House h2 = new House(40, 70000, "Oxford");
        House h3 = new House(70, 180000, "Paris");
        House h4 = new House(50, 90000, "Moscow");

        houses.add(h1);
        houses.add(h2);
        houses.add(h3);
        houses.add(h4);

        for (House h: houses) {
            System.out.println(h);
        }
 */