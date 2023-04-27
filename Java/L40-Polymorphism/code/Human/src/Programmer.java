public class Programmer extends Human {
    // конструктуор класса

    public Programmer (String firstName, String lastName){
        super (firstName, lastName);
    }

    @Override
    public void work() {
        System.out.println("Програмист любит писать код");
        doCode(); // это еще один метод который мы придумали
    }

    public void doCode (){ // реализация метода doCode
        System.out.println("Сидим за клавиатурой, думаем и печтаем код");
    }
}
