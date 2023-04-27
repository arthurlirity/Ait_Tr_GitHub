public class Bear extends Animal{
    String breed;

    public Bear(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void makeNoise(){
        System.out.println("Рррррр...!");
    }

    public void eat() {
        System.out.println("Мед");
    }

    public void getDescription(){
        System.out.println("Описание отряда медвежих...");
    }

    @Override
    public String toString() {
        return "Bear{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
