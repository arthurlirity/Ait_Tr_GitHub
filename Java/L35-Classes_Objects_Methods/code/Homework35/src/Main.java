import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Задача 1.
        //Создайте класс Wine, который содержит переменные name, sort и year.+
        //Создайте три экземпляра этого класса. +
        //Выведите на консоль значения их переменных методом toString.+
        //Добавить в класс Wine метод: onStock, имеет один параметр – количество бутылок.+
        //Выводит на консоль сообщение "На складе имеется количество бутылок".+
        //Задайте метод getYear – возвращает год производства вина.
        //Вызвать этот метод для каждого из объектов.
        //
        //Можно выполнить это задание на примере собственного класса с тремя полями.

        Wine myWine1 = new Wine();
        myWine1.name = "Kara Kermen";
        myWine1.sort = "Saperavi";
        myWine1.year = 2016;

        Wine myWine2 = new Wine();
        myWine2.name = "Penfolds Grange";
        myWine2.sort = "Cabernet Sauvignon";
        myWine2.year = 2014;

        Wine myWine3 = new Wine();
        myWine3.name = "Saint Clair Family Estate";
        myWine3.sort = "Sauvignon Blanc";
        myWine3.year = 2016;

        System.out.println(myWine1.toString());
        System.out.println(myWine1.onStock(5));
        System.out.println(myWine1.getYear());
        System.out.println();

        System.out.println(myWine2.toString());
        System.out.println(myWine2.onStock(2));
        System.out.println(myWine2.getYear());;
        System.out.println();

        System.out.println(myWine3.toString());
        System.out.println(myWine3.onStock(12));
        System.out.println(myWine3.getYear());;
        System.out.println();


    }
}