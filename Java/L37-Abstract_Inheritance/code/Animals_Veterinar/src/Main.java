import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Звери у ветеринара");

        Dog dog1 = new Dog("собака", "пудель");
        dog1.makeNoise();
        dog1.eat();
        dog1.getDescription();

        System.out.println();

        Cat cat1 = new Cat("кошка", "сиамская");
        cat1.makeNoise();
        cat1.eat();
        cat1.getDescription();

        System.out.println();

        Bear bear1 = new Bear("медведь", "косолапый");
        bear1.makeNoise();
        bear1.eat();
        bear1.getDescription();

        List animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(cat1);
        animals.add(bear1);

        System.out.println();
        System.out.println(animals);
        System.out.println();
        Vet vet1 = new Vet(); // создали ветеринара
        Scanner sc = new Scanner(System.in);
        String choice = "";
        int i = 0;

//        vet1.treatAnimal((Animal) animals.get(0));
//        vet1.treatAnimal((Animal) animals.get(1));

        while (true){
            if (i < 3) {
                vet1.treatAnimal((Animal) animals.get(i));
                i++;
            } else {
                System.out.println("Очередь из зверей закончилась.");
                break;
            }
            System.out.println("Следующий? y/n ");
            choice = String.valueOf(sc.nextLine().toLowerCase().charAt(0));
            if (choice == "n") {break;}
        }

    }
}