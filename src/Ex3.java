//Наполнить массивы объектами разных классов и распечатать информацию об этих объектах в консоль
public class Ex3 {
    public static void main(String[] args) {
        Colors red = new Colors("red", 100);
        Colors blue = new Colors("blue", 200);
        Colors green = new Colors("green", 300);

        Fruit orange = new Fruit("orange",150);
        Fruit lime = new Fruit("green", 100);
        Fruit apple = new Fruit("red", 90);

        Object[] allObject = new Object[]{red, blue, green, orange, lime, apple};

        for(Object o: allObject) {
            System.out.println(o);
        }
    }



}
