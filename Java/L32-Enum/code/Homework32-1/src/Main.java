public class Main {
    public static void main(String[] args) {

        //"01.03.2023
        //создать свой enum"

        System.out.println("Пример использования enum - Громость музыки");

        enum Volume {
            HIGH,
            MEDIUM,
            LOW,
        }

        Volume mySeasons = Volume.HIGH;
        switch (mySeasons) {
            case HIGH -> {
                System.out.println("Делаем музыку громче");
                System.out.println("Могут быть проблемы с соседями :)");
                break;
            }
            case MEDIUM -> {
                System.out.println("Ставим громкость по середине");
                break;
            }
            case LOW -> {
                System.out.println("Делаем громкость меньше");
                break;
            }
        }
    }
}