/*1. Написать классы на тему "Автомобиль" (несколько классов) с использованием интерфейсов и абстрактных классов. У
        автомобиля должно быть:
        1.1) Мотор
        1.2) Колеса
        1.3) Имеет количество мест
        1.4) Информация о категории прав которые необходимы для управления транспортным средством
        1.5) Имеет замок который можно открыть определенным ключом*/

import java.util.Arrays;

public abstract class Car {
    private Motor motor;
    private Wheels[] wheels;
    private int countSeats;
    private RightsCategory[] category;
    private Key[] key;

    public Car(Motor motor, Wheels[] wheels, int countSeats, RightsCategory[] category, Key[] key) {
        this.motor = motor;
        this.wheels = wheels;
        this.countSeats = countSeats;
        this.category = category;
        this.key = key;
    }

    public Key[] getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "Car{" +
                "motor=" + motor +
                ", wheels=" + Arrays.toString(wheels) +
                ", countSeats=" + countSeats +
                ", category=" + Arrays.toString(category) +
                ", key=" + Arrays.toString(key) +
                '}';
    }
}
