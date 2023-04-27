public class DancerClassik extends Dancer {
    String name; // это имя танцора
    int age; // его возраст
    String sex; // пол танцора

    @Override
    public void dance() {
        super.dance();
    }

    // конструктор
    public DancerClassik(String name, int age, String sex) {
        super(name, age, sex);
        this.name = name;
        this.age = age;
        this.sex = sex;
    }



    @Override
    public String toString() {
        return "Танцор " +
                "имя ='" + name + '\'' +
                ", возраст ='" + age + '\'' +
                ", пол ='" + sex + '\'' +
                ' ';
    }
}
