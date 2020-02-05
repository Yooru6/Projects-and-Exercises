package Parts;

public class Lettuce implements PartsIF {
    private String type;

    public Lettuce(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Lettuce: "+ type;
    }
}
