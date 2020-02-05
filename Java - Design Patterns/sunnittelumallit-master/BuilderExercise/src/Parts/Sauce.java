package Parts;

public class Sauce implements PartsIF {
    private String type;

    public Sauce(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sauce: "+ type;
    }
}
