public class Main {
    public static void main(String[] args) {
        System.out.println("Доступ к полям класса (модификаторы public, private...)");

        Person person = new Person("", 32, "Baker Street 26", "+1234567");
        person.displayName();
        person.displayAge();
        person.displayPhone();
       // person.displayAddress(); // он в привате

    }
}