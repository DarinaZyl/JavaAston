import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("It's my second homework");

        CarBMW car1 = new CarBMW(
                new Motor("Engine", 2.0,Fuel.AI98),
                new Wheels[]{
                        new Wheels("переднее правое",15,TireSeason.SUMMER),
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

        /*здесь хочу дописать проверку ключей машины и водителя и если совпадает хоть 1,
        то проверку категорий водителя и машины и тогда завети ее водителем

        но пока что не получилось забрать значения ключей по 1 для сверки (а может времени не хватило подумать)
        */

        System.out.println("Дальше нужно дописать!!!!!!!");


    }
}