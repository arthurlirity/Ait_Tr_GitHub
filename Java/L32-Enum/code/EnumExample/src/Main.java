public class Main {
    public static void main(String[] args) {
        System.out.println("Пример использования enum - 4 времени года");

        enum Seasons {
            WINTER,
            SPRING,
            SUMMER,
            AUTUMN,

        }

        Seasons mySeasons = Seasons.SPRING;
        switch (mySeasons) {
            case SPRING -> {
                System.out.println("Весной светит солнце");
                System.out.println("Весной наступает Пасха - всем красить яйца!");
                break;
            }
            case SUMMER -> {
                System.out.println("Все идем в отпуск!");
                break;
            }
            case AUTUMN -> {
                System.out.println("Берем с собой зонтик");
                System.out.println("Идем по грибы");
                break;
            }
            case WINTER -> {
                System.out.println("Надеваем валенки и тулупы");
                break;
            }
        }

    }
}