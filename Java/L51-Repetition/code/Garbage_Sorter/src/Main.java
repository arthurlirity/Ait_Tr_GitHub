import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Main m = new Main();
        m.garbageSorter();
    }

        //Задача 2. Задача на условие, switch case Создать "Бот-помощник", который помогает сортировать мусор.
        // На входе - наименование выбрасываемого мусора, на выходе сообщение, в какого цвета урну нужно отправить этот мусор.
        // Если выбрасывается стекло (бутылки, банки и т.д.), то бот должен запросить цвет и указать, куда выбросить цветное стекло.
    public void garbageSorter (){
        Scanner scanner = new Scanner(System.in);
        String garbageSort;

        do {

            System.out.println("What kind of garbage do you want to throw away?");
            garbageSort = scanner.nextLine().toUpperCase();

            switch (garbageSort) {


                case "PAPER":
                    System.out.println("Throw to white container");
                    break;

                case "FOOD":
                    System.out.println("Throw to red container");
                    break;

                case "GLASS":
                    System.out.println("Indicate the colour - WHITE, GREEN or BROWN");

                    String glassColour = scanner.nextLine();
                    if (glassColour.equalsIgnoreCase("WHITE")) {
                        System.out.println("Throw to white glass compartment");
                    } else if (glassColour.equalsIgnoreCase("GREEN")) {
                        System.out.println("Throw to green glass compartment");
                    } else {
                        System.out.println("Throw to brown glass compartment");
                    }
                    break;

                default:
                    System.out.println("This sort of garbage does not exist");
            }
            System.out.println("Do you want to throw away more garbage? Enter any letter if yes and 'no' if not");


        } while (scanner.nextLine().toUpperCase().equals("NO")) ;












    }
}