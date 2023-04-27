public class BreakDancer extends Dancer{
    // конструктор вытащил поля родительского класса
    public BreakDancer(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    public void dance() {
        System.out.println(toString() + "двигается, как старый робот.");
    }
}
