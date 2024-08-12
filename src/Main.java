import forAll.Fuel;
import forAll.Key;
import forAll.RightsCategory;
import forCar.CarBMW;
import forCar.Motor;
import forCar.TireSeason;
import forCar.Wheels;
import forDriver.DriverCar;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        System.out.println("It's my second homework");

        CarBMW car1 = new CarBMW(
                new Motor("Engine", 2.0, Fuel.AI98),
                new Wheels[]{
                        new Wheels("переднее правое",15, TireSeason.SUMMER),
                        new Wheels("переднее левое",15,TireSeason.SUMMER),
                        new Wheels("заднее правое",15,TireSeason.ALLSEASONS),
                        new Wheels("заднее левое",15,TireSeason.ALLSEASONS)
                },
                5,
                new RightsCategory[]{
                        RightsCategory.B
                },
                new Key[]{
                        new Key("ert1542")},
                "X7"
        );

        System.out.println("Первая машина " + car1);

        DriverCar driver1 = new DriverCar(
                25,
                new RightsCategory[]{
                        RightsCategory.AM,
                        RightsCategory.B
                },
                new Key[]{
                        new Key("ert1542"),
                        new Key("ert1555")
                },
                "Иванов Анатолий Петрович"
        );

        System.out.println("Первый водитель " + driver1);

        System.out.println("У водителя есть следующие ключи " + Arrays.toString(driver1.getKey()));
        System.out.println("Машину можно открыть следующим ключом " + Arrays.toString(car1.getKey()));

        Key[] keyDriver = driver1.getKey();
        Key[] keyCar = car1.getKey();
        RightsCategory[] categoryDriver = driver1.getCategory();
        RightsCategory[] categoryCar = car1.getCategory();

        for (int i = 0; i < keyDriver.length; i++) {
            for (int j = 0; j < keyCar.length; j++) {
               if (Objects.equals(keyDriver[i].getKey(), keyCar[j].getKey())){
                   keyDriver[i].open();
                   driver1.open();

                   for (int k = 0; k < categoryDriver.length; k++){
                       for (int m = 0; m < categoryCar.length; m++){
                           if (Objects.equals(categoryCar[m].name(), categoryDriver[k].name())){
                               driver1.start();
                           }
                       }
                   }

                   break;
               }
            }

        }



    }
}