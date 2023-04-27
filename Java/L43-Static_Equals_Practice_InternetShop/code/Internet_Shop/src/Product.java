public class Product {
    //        Создать класс Товар, имеющий переменные имя, цена, рейтинг.
    String name; // имя товара
    double price; // цена товара
    int rating; // рейтинг товара

    // конструктор класса
    public Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    // переопределение метода toString (выводит поля объекта в одну строку)
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    // переопределение метода сравнения объектов в классе Product
    // по совпадению названияи стоимости
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        if (Double.compare(product.price, price) != 0) return false;
        return name.equals(product.name);
    }

    // переопределяем метод hashCode
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
