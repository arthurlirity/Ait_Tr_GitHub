public class House implements Comparable<House> { // можем сравнивать и сортировать объекты этого класса
    int area; // площадь дома
    int price; // цена
    String city; // город

    // конструктор класса
    public House(int area, int price, String city)
    {
        this.area = area;
        this.price = price;
        this.city = city;
    }
    // переопределение метода toString
    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", price=" + price +
                ", city='" + city +
                '}' + '\n' ;
    }

    @Override // директива переопредеоения
    public int compareTo(House anotherHouse) { // сигнатура метода: тип возвращаемого значения, наименование метода и параметры вызова
        if (this.price == anotherHouse.price) { // условие сравнения по площади дома, это математическое сравнение целых чисел
            return 0; // возвращаем 0, если площади равны
        } else if (this.price < anotherHouse.price) {
            return -1; // возвращаем -1, если одна площадь меньще другой
        } else {
            return 1; // возвращаем -1, если одна площадь меньще другой
        }
    }

}
