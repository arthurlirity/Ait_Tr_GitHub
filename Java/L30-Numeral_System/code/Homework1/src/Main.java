import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // "27.02.2023
        //Самостоятельно решить задачу на перевод десятичного в двоичное число"
        // Число должно быть целым и положительным

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите двоичное число: ");
        String binary_number = sc.next();

        int l = binary_number.length();

        String[] simbols = new String[l];
        ArrayList<String> simbolsArrayList = new ArrayList<>();

        for (int i = 0; i < l; i++) {
            simbols[i] = String.valueOf(binary_number.charAt(i));
            simbolsArrayList.add(i, simbols[i]);
        }

        int decimal_number = 0;

        for (int i = 0; i < simbols.length; i++) {
            Character simbol = simbols[i].charAt(0);
            int s = Character.getNumericValue(simbol);
            decimal_number = decimal_number + (int) (s * Math.pow(2, (l - 1 - i)));
        }
        System.out.println("Десятичное число = " + decimal_number);
    }
}

