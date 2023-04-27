import java.util.ArrayList;

public class Category {
    //        Создать класс Категория, имеющий переменные имя и массив товаров.
    String name; // наименование категории
    ArrayList products; // массив товаров

    // конструктор класса
    public Category(String name, ArrayList products) {
        this.name = name;
        this.products = products;
    }

    // переопределили метод toString
    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
