public class TwistDancer extends Dancer{
    // конструктор вытащил поля родительского класса
    public TwistDancer(String name, int age, String sex) {
        super(name, age, sex); // эти поля из родительского класса
    }
    // переопределяем петод dance из родительского класса
    // на данном этапе мы пишем словами, как танцуют твист
    // Code - > Generate -> выбрать метод


    @Override
    public void dance() {
        System.out.println(toString() + "двигается под музыку, при этом он активно скручивает свое тело, приседает и как бы тушит носком ноги окурок на полу." );
        // super.dance();
    }
}


/*
  System.out.println(toString() + "двигается под музыку, при этом он активно скручивает свое тело, приседает и как бы тушит носком ноги окурок на полу.");
 */