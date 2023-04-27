import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Интернет - магазин.v 0.1");
//        Создать класс Товар, имеющий переменные имя, цена, рейтинг. - DONE
//        Создать класс Категория, имеющий переменные имя и массив товаров. - DONE
//        Создать несколько объектов класса Категория. - DONE
//        Создать класс Basket, содержащий массив купленных товаров. - DONE
//        Создать класс User, содержащий логин, пароль и объект класса Basket - DONE
//        Создать несколько объектов класса User
//        Вывести на консоль каталог продуктов.
//        Вывести на консоль покупки посетителей магазина.

        // создаем продукты|объекты в классе Products
        Product p1 = new Product("утюг", 80, 5);
        Product p2 = new Product("кофемашина", 300, 4);
        Product p3 = new Product("холодильник", 600, 7);
        Product p4 = new Product("компьютер", 600, 7);
        Product p5 = new Product("ноутбук", 1000, 7);

        // это массив товаров
        ArrayList products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        // создаем несколько категорий товаров
        Category category1 = new Category("бытовая техника", products);
        Category category2 = new Category("компьютеры", products);
        Category category3 = new Category("мебель", products);

        // печать массива товаров
        System.out.println(products);
        System.out.println();
        // печать массива товаров более красивая
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
        System.out.println();
        // печать категории товаров
        System.out.println(category1);
        // создаем корзину
        Basket b1 = new Basket(products);

        // создаем пользователей
        User u1 = new User("log1", "pass1", new Basket(products));
        System.out.println(u1);

    }
}