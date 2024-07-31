public class DriverCar extends Driver{
    private String fio;

    public DriverCar(int experience, RightsCategory[] category, Key[] key, String fio) {
        super(experience, category, key);
        this.fio = fio;
    }


    @Override
    public String toString() {
        return "DriverCar{" +
                "fio='" + fio + '\'' +
                super.toString() + " " +
                '}';
    }
}
