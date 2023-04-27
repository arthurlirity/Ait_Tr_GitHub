public class Main {
    public static void main(String[] args) {
        System.out.println("Класс телефон - практикум");

        Phone phone1 = new Phone( "+94 28 000 00 00", "Samsung", "A5");
        Phone phone2 = new Phone( "+38 093 000 00 00", "Apple", "iPhone 10");
        Phone phone3 = new Phone( "+49 152 000 00 00", "Xiaomi", "Redmi 5");

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);









    }
}


        /*
        Phone myPhone1 = new Phone (); // порождаем новый экземляр класса
        myPhone1.phoneNumber = "+94 28 000 00 00";
        myPhone1.brand = "Samsung";
        myPhone1.model = "A5";

        Phone myPhone2 = new Phone (); // порождаем новый экземляр класса
        myPhone2.phoneNumber = "+38 093 000 00 00"; // задаем конкретные параметры экземляра
        myPhone2.brand = "Apple";
        myPhone2.model = "iPhone 10";

        Phone myPhone3 = new Phone ();
        myPhone3.phoneNumber = "+49 152 000 00 00";
        myPhone3.brand = "Xiaomi";
        myPhone3.model = "Redmi 5";


        System.out.println(myPhone1.toString());
        System.out.println(myPhone2.toString());
        System.out.println(myPhone3.toString());

        myPhone1.receiveCall("My friend");

        System.out.println("Номер первого телефона: " + myPhone1.getPhoneNumber());
*/