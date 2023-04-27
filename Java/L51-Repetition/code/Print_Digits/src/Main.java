import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Main m = new Main();
        printDigits(5329);
    }


/*Задача 3 (*). Цикл while // Вводится натуральное число.
Напечатать, из каких цифр оно состоит. // Пример: // 5329 - это число // 5 // 3 // 2 // 9 // -
это цифры, из которого состоит число
5329 % 10 = 9
5329/10 = 532
532%10 = 2
532/10 =53
53%10 = 3
     */

    public static void printDigits(int n) {
        List<Integer> numbers = new ArrayList<>();

        while (n > 0) {
            System.out.println(n % 10);

            numbers.add(n % 10);
            n = n / 10;
        }
        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}