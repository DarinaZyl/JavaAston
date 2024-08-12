package forCar;/*1.1) Мотор
 1.1.1) Имеет объем
 1.1.2) Хранит информацию о бензине который в него можно заливать
 1.1.3) Имеет наименование*/

import forAll.Fuel;
import forAll.Name;

public class Motor extends Name {
    private double volume;
    private Fuel fuel;

    public Motor(String name, double volume, Fuel fuel) {
        super(name);
        this.volume = volume;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "forCar.Motor{" +
                super.toString() + " " +
                "volume=" + volume +
                ", fuel=" + fuel +
                '}';
    }
}
