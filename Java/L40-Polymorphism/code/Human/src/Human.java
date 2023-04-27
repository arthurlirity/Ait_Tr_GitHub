public class Human {

    private String firstName;

    private String lastName;

    // конструктор класса
    public Human(String firsName, String lastName) {
        this.firstName = firsName;
        this.lastName = lastName;
    }

    //метод, который отправляет человека на работу

    public void work(){ // название метода придумали сами
        System.out.println("Человек устроился на должность и пошел на работу");
    }

}