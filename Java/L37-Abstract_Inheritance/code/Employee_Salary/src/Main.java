import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Работник и зарплата");
        // Нужно иметь систему, в которой есть сотрудники, их зарплаты и надо уметь отправлять им
        // письма по емейл с информацией об их зарплате.

        //так создать экземляр Employee не получается
        //Employee emp1 = new Employee("Alex","alex@gmail.com",101) {
        //emp1.mailPaySlip();
        //}

        Salary s1 = new Salary("Alex","alex@gmail.com",101, 60000);
        Salary s2 = new Salary("John","john@gmail.com",102, 48000);


//      System.out.println(s1);
//      System.out.println(s2);


        System.out.println("Вызываем метод mailPaySlip");
        System.out.println();

        s1.mailPaySlip();
        System.out.println();

        s2.mailPaySlip();

        // метод установки новой зарплаты
        s2.setSalary(54000);
        System.out.println();
        s2.mailPaySlip(); // отправили уведомление






    }
}