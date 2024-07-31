public class Fruit {
    private String color;
    private int weight;

    public Fruit(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
