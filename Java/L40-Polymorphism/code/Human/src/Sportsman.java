public class Sportsman extends Human {
    // конструктуор класса

    public Sportsman (String firstName, String lastName){
        super (firstName, lastName);
    }

    @Override
    public void work() {
        System.out.println("Надо идти на тренеровку");
        playFoortball(); // это еще один метод который мы придумали
    }

    public void playFoortball (){ // реализация метода doCode
        System.out.println("Бегать с мячом");
    }
}
