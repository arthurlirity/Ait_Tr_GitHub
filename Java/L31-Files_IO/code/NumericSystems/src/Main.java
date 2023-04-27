public class Main {
    public static void main(String[] args) {
        System.out.println("Перевод из одной числовой системы в другую методами Java");
        System.out.println();

        // Перевод из двоичной системы в десятиричную
        System.out.println("Перевод из двоичной системы в десятичную");
        String string_num = "1000"; // двоичное число задано строкой
        System.out.println("Двоичное число (строка символов): " + string_num);
        int binaryNumber = Integer.parseInt(string_num, 2);
        System.out.println("В десятичной системе это число: " + binaryNumber);
        System.out.println();


        // Перевод из десятиричной системы  в двоичную и другие

        System.out.println("Перевод десятиричного числа в двоичное (будет выведено строкой)");
        int n = 162;
        System.out.println("Десятиричное число");

        String binary_num = "";
        binary_num = Integer.toBinaryString(n);
        System.out.println("Двоичное представление этого числа: " + binary_num);
        System.out.println();

        String octagal_num = Integer.toOctalString(n);
        System.out.println("В восьмеричной системе это: " + octagal_num);
        System.out.println();

        String hex_num = Integer.toHexString(n);
        System.out.println("D 16-ричной системе это: " + hex_num);
        System.out.println();

        // Перевод числа из типа String в числовой тип int

        System.out.println("Перевод строки, содержащей число, в число");
        String strNum = "155";
        System.out.println("Строка: с цифрами: " + strNum);

        int num1 = Integer.parseInt(strNum); // присвоили найденное в строке число в переменную
        System.out.println("Получилось число: "+num1); // находим число внутри строки
        System.out.println();

        String st = "5";
        int table_num = Integer.parseInt(st);
        System.out.println("Номер столика: " +table_num);

    }
}




