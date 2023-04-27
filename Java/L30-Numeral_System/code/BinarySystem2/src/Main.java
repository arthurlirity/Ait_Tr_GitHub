import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Перевод двочного числа в десятеричное");
        Scanner sc = new Scanner(System.in);

  /*      char ch = '1';
        int num;
        num = Character.getNumericValue(ch); // проверка, что можем перевести символ в число (char -> int)
        System.out.println("Символ " + ch + " его знанчение: " + num);

        int pow = (int) (num * Math.pow( 2, 10)); // проверка возведения в степень
        System.out.println(pow);
*/
        System.out.println("Введите двоичное число: ");
        String binary_number = sc.next(); // ввод двоичного числа строкой

        int l = binary_number.length(); // узнали длину строки

        String[] simbols = new String[l]; // заводим массив под цифры двоичного числа
        ArrayList<String> simbolsArrayList = new ArrayList<>(); // аналогичный массив, но его проще печатать

        // заполняем массив цифрами
        for (int i = 0; i < l; i++) {
            simbols[i] = String.valueOf(binary_number.charAt(i)); // читаем по одному символу
            simbolsArrayList.add(i, simbols[i]); // заносим в массив
        }

        System.out.println(simbolsArrayList); // распечатали полученный массив для проверки

        int decimal_number = 0; // задали начальное знанчение десятичного числа
        // цикл для вычисления десятичного значения
        // число(10) = знак*2^(n-1) + знак*2^(n-2) + ...+ знак*2^(1) + знак*1

        for (int i = 0; i < simbols.length; i++) { // цикл идет по символам в массиве
            // int l = simbols.length; // нужн адлина массива для вычисления показателя степени
            Character simbol = simbols[i].charAt(0); // взяли текущий символ
            int s = Character.getNumericValue(simbol); // преобразовали его в число типа int
            decimal_number = decimal_number + (int) (s * Math.pow(2, (l - 1 - i))); // вычислили десятичное число
        }
        System.out.println("Десятичное число = " + decimal_number);
    }
}