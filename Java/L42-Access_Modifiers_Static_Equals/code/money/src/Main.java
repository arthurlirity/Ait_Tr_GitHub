public class Main {
    public static void main(String[] args) {
        System.out.println("Сравнение для класса Money");

        Money m1 = new Money( 1000, "USD");
        m1.toString();
        System.out.println(m1);

        Money m2 = new Money( 1000, "EUR");
        Money m3 = new Money( 1000, "USD");


        System.out.println();

        System.out.println(m1.equals(m3));


        // создать элементы класса money

        // придумать пример когда мы какие то деньги сравниваем с какими-то другими деньгами




    }
}