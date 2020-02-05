package Parts;

public class Cheese implements PartsIF{
    private String type;

    public Cheese(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cheese: "+ type;
    }
}
