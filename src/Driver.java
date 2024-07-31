/*Написать класс на тему "Водитель". У водителя должно быть:
 2.1) Стаж вождения
 2.2) Возможность указывать права нескольких категорий или отсутствие прав
 2.3) Иметь или не иметь необходимые ключи для открытия разных автомобилей

 3. Водитель должен мочь:
 3.1) Открывать и заводить автомобиль
 3.2) Водить автомобиль
 3.3) Принимать пассажиров
 3.4) Заправлять автомобиль*/

import java.util.Arrays;

public abstract class Driver {
    private int experience;
    private RightsCategory[] category;
    private Key[] key;

    public Driver(int experience, RightsCategory[] category, Key[] key) {
        this.experience = experience;
        this.category = category;
        this.key = key;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                ", category=" + Arrays.toString(category) +
                ", key=" + Arrays.toString(key) +
                '}';
    }
}
