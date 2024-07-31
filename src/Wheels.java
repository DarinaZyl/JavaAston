/*1.2) Колеса
 1.2.1) Имеет радиус или диаметр
 1.2.2) Имеют три варианта сезонности: зимние\летние\всесезонные
 1.2.3) Имеет наименование*/

public class Wheels extends Name {
    private int diameter;
    private TireSeason season;

    public Wheels(String name, int diameter, TireSeason season) {
        super(name);
        this.diameter = diameter;
        this.season = season;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                super.toString() + " " +
                "diameter=" + diameter +
                ", season=" + season +
                '}';
    }
}
