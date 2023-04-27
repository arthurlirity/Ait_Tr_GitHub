public class Wine {
    String name;
    String sort;
    int year;

    public String onStock(int numberOfBottles) {
        return (numberOfBottles + " - bottles in stock");
    }

    public int getYear  () {
        return year;
    };

    @Override
    public String toString() {
        return "Wine" +
                "name: '" + name + '\'' +
                ", Sort :'" + sort + '\'' +
                ", Year :" + year +
                '.';
    }


}
