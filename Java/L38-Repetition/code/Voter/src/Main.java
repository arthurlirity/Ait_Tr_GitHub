public class Main {
    public static void main(String[] args) {
        System.out.println("Контроль возраста избирателя на уровне конструктора класса");
        System.out.println();

        Voter v1 = new Voter ("2321312",15, "Willy");
        System.out.println(v1);
        System.out.println();

        Voter v2 = new Voter ("9882349",35, "John");
        System.out.println(v2);

        Voter v3 = new Voter ("234234",47, "");
        System.out.println(v3);




    }
}