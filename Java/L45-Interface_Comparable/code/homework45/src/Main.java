import java.awt.print.PrinterJob;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Compare Phones");

        Phone p1 = new Phone("Iphone", 500, 256);
        Phone p2 = new Phone("Nokia", 300, 128);
        Phone p3 = new Phone("Motorola", 200, 64);
        Phone p4 = new Phone("Vertu", 430, 32);
        Phone p5 = new Phone("Simens", 90, 16);


        TreeSet phoneList = new TreeSet<>();

        phoneList.add(p1);
        phoneList.add(p2);
        phoneList.add(p3);
        phoneList.add(p4);
        phoneList.add(p5);

        System.out.println("Phone List");
        System.out.println(phoneList);


    }
}