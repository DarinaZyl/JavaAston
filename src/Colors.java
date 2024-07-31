public class Colors {
    private String name;
    private int numColor;

    public Colors(String name, int numColor) {
        this.name = name;
        this.numColor = numColor;
    }

    @Override
    public String toString() {
        return "Colors{" +
                "name='" + name + '\'' +
                ", numColor=" + numColor +
                '}';
    }
}
