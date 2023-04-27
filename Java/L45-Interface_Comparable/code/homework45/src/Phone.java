public class Phone implements Comparable<Phone> {

    String name;
    int price;
    int memory;

    public Phone(String name, int price, int memory) {
        this.name = name;
        this.price = price;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", memory=" + memory +
                '}';
    }

    @Override
    public int compareTo(Phone o) {
        if (this.memory == o.memory){
            return 0;
        } else if  (this.memory < o.memory) {
            return -1;
        } else {
            return 1;
        }
    }
}

// вариант сортировки по алфовиту
// public compareTo(Phone other){
// return CharSequence.compare(this.name, other.name)
