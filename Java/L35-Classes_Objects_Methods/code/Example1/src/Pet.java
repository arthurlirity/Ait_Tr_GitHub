public class Pet {
    String type;
    String breed;
    String name;
    double weight;

    @Override // переопределение метода
    public String toString() {
        return "Pet" +
                "type='" + type + '\'' +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}




