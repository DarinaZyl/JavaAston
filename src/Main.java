
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
                        new Key("ert1542"),
                        new Key("kju1548")
                },
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

        /*

        if (driverKey.equals(avtoKey)){
            System.out.println("Автомобиль с мотором " + car.getMotor().getName()
                    + " объемом " + car.getMotor().getVolume()
            );
            driver.open();
            driver.refill();
            System.out.println(driver.openAndStartCar());
            driver.getPassengers();
            driver.drive();
        }
        else {
            System.out.println("У водителя нет ключа от машины");
        };*/


    }
}