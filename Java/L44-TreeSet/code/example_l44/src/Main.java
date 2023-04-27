import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Пример наполнения TreeSet");

        TreeSet ts = new TreeSet(); // создаем новый элемент класса TreeSet

        ts.add("A");
        ts.add("C");
        ts.add("J");
        ts.add("B");
        ts.add("A");
        ts.add("E");
        ts.add("Ekaterina");
        ts.add("10");

        System.out.println(ts);

        TreeSet tsNum = new TreeSet();

        tsNum.add(1);
        tsNum.add(3);
        tsNum.add(8);
        tsNum.add(2);
        tsNum.add(9);
        tsNum.add(3);

        System.out.println(tsNum);


    }
}