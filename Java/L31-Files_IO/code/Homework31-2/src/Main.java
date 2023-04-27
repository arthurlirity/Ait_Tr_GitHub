public class Main {
    public static void main(String[] args) {

        //### Задача 2
        //1. Перевести двоичное число 111000111000111000 в десятичное.
        //2. Дано десятичное число 9876543210.
        //Каконо будет выглядеть в двоичной, двенадцатеричной и шестнадцатиричной системах счисления?

        // Перевод из двоичной системы в десятиричную
        System.out.println("Перевод из двоичной системы в десятичную");
        String string_num = "111000111000111000";
        System.out.println("Двоичное число: " + string_num);
        int binaryNumber = Integer.parseInt(string_num, 2);
        System.out.println("В десятичной системе это число: " + binaryNumber);
        System.out.println();
        System.out.println("___________________");

        // Перевод десятиричного числа в двоичное
        System.out.println("Перевод десятиричного числа в двоичное");
        long n = 9876543210L;
        System.out.println("Десятиричное число: " + n);

        String binary = "";
        binary = Long.toBinaryString(n);
        System.out.println("Двоичное представление этого числа: " + binary);
        System.out.println();

        String octagal_num = Long.toOctalString(n);
        System.out.println("В восьмеричной системе это: " + octagal_num);
        System.out.println();

        String hex_num = Long.toHexString(n);
        System.out.println("D 16-ричной системе это: " + hex_num);
        System.out.println();

    }
}