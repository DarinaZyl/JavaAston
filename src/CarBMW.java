public class CarBMW extends Car {
    private String model;

    public CarBMW(Motor motor, Wheels[] wheels, int countSeats, RightsCategory[] category, Key[] key, String model) {
        super(motor, wheels, countSeats, category, key);
        this.model = model;
    }

    @Override
    public String toString() {
        return "CarBMW{" +
                "model='" + model + '\'' +
                super.toString() + " " +
                '}';
    }
}
