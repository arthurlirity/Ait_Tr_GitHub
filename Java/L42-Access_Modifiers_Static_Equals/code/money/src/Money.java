public class Money {

    private long amount; // переменная типа long - это целые числа
    private String currency; // название валюты - USD, EUR, ...

// конструктор модифицированный
    public Money(double amount, String currency) { // переопределили тип переменной
        this.amount = Math.round(amount * 100); // round - это округление и умножение на сто
        this.currency = currency;
    }
// переопределение метода toString
    @Override
    public String toString() { // это сигнатура метода, доступный возвращать строку
        return String.format("%.2f %s", amount / 100.0, currency.toUpperCase());  // вывод кол-ва денег и названия валюты
    }

    // переопределение метода equals - второй вариант
    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Money that = (Money) obj;
        return this.amount == that.amount && this.currency.equalsIgnoreCase(that.currency);
    }
}


// переопределение метода equals - первый вариант
//    @Override
//    public boolean equals(Object other) {
//        if (this == other) { // если этот элемент класса равен другому элементу класса
//            return true;
//        }
//        if (!(other instanceof Money money)) { // такая валюта уже есть в обьектах этого класса
//            return false; // если такой валюты нет, то возвращаем фальш
//        }
//        return amount == money.amount && currency.equalsIgnoreString(money.currency);
//    }
//}