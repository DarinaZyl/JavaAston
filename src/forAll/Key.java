package forAll;

public class Key implements Openable {
    private String key;

    public Key(String key) {
        this.key = key;
    }

    public Key() {

    }

    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "forAll.Key{" +
                "key='" + key + '\'' +
                '}';
    }

    @Override
    public void open() {
        System.out.println("Ключ может открыть замок");
    }
}
