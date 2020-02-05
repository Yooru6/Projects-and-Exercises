package Parts;

public class Bread implements PartsIF {
    private String type;

    public Bread(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bread: "+ type;
    }
}
