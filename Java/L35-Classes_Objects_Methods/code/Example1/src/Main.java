import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // создание класса внутри класса Main


        class Car { // придумали имя класса
            String brand; // описали главные его характеристики
            String color;
            int year;
            String type;
        }

        Car myCar = new Car();
        myCar.brand = "VW";
        myCar.color = "Silver";
        myCar.type = "Universal";
        myCar.year = 2018;

        System.out.println("Марка автомобиля: " + myCar.brand + " Цвет " + myCar.color + " Год выпуска " + myCar.year);

        Pet myPet = new Pet();
        myPet.type = "cat";
        myPet.breed = "Burmese";
        myPet.name = "Benjamine";
        myPet.weight = 4.5;

        System.out.println("Тип " + myPet.type  + " Порода " + myPet.breed + " Имя " + myPet.name + " Вес " + myPet.weight);

        System.out.println(myPet);



    }
}
