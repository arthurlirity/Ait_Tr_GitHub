public class Programmer extends Human {
    public int exprince; // открытое поле отражает количество лет в опыте програмиста

    public Programmer(int age, boolean is_worker, int exprince) {
        super(age, is_worker);
        this.exprince = exprince;
    }
}
