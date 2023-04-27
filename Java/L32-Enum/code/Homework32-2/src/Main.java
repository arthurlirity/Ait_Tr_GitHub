import java.util.Currency;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //"01.03.2023
        //список из 5 валют на базе enum"

        System.out.println("Список валют");

        enum Currancy {
            USD(),
            EUR(),
            GBP(),
            JPY(),
            AUD();
        }

        for (Currancy currancyList: Currancy.values()) {
            System.out.println(currancyList);
        }
        System.out.println("Выберите валюту. Нажмите 1, 2, 3, 4 или 5");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        Currancy currancyList = Currancy.EUR;

        int exchangeRates = 0;


        switch (choice) {
            case 1: {
                currancyList = Currancy.USD;
                break;
            }
            case 2: {
                currancyList = Currancy.EUR;
                break;
            }
            case 3: {
                currancyList = Currancy.GBP;
                break;
            }
            case 4: {
                currancyList = Currancy.JPY;
                break;
            }
            case 5: {
                currancyList = Currancy.AUD;
                break;
            }
        }

        switch (currancyList) {
            case USD -> {
                exchangeRates = 1;
                System.out.println("Курс " + exchangeRates + " Euro");
                break;
            }
            case EUR -> {
                exchangeRates = 2;
                System.out.println("Курс " + exchangeRates + " Euro");
                break;
            }
            case GBP -> {
                exchangeRates = 3;
                System.out.println("Курс " + exchangeRates + " Euro");
                break;
            }
            case JPY -> {
                exchangeRates = 4;
                System.out.println("Курс " + exchangeRates + " Euro");
                break;
            }
            case AUD -> {
                exchangeRates = 5;
                System.out.println("Курс " + exchangeRates + " Euro");
                break;
            }
        }
        System.out.println("Спасибо, что пользовались нашим обменником");
    }
}