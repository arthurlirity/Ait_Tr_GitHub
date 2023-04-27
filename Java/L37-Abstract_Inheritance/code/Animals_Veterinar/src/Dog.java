public class Dog extends Animal{
    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void makeNoise(){
        System.out.println("Гав - гав!");
    }

    public void eat() {
        System.out.println("Собачий корм Pedigree");
    }

    public void getDescription(){
        System.out.println("Описание отряда собачьих (псовые)...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
